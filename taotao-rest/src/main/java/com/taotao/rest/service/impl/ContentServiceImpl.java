package com.taotao.rest.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import com.taotao.pojo.TbContentExample.Criteria;
import com.taotao.rest.component.JedisClient;
import com.taotao.rest.service.ContentService;

/**
 * 内容查询服务
 * 
 * @author Jerry
 *
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentMapper contentMapper;

	@Autowired
	private JedisClient jedisClient;
	@Value("${REDIS_CONTENT_KEY}")
	private String REDIS_CONTENT_KEY;

	/*
	 * 根据cid 查询内容列表
	 * 
	 * @see
	 * com.taotao.rest.service.ContentService#getContentList(java.lang.Long)
	 */
	@Override
	public List<TbContent> getContentList(Long cid) {
		// 添加缓存
		try {
			String json = jedisClient.hget(REDIS_CONTENT_KEY, cid + "");
			if (!StringUtils.isBlank(json)) {
				List<TbContent> list = JsonUtils.jsonToList(json, TbContent.class);
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		TbContentExample example = new TbContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(cid);
		List<TbContent> list = contentMapper.selectByExampleWithBLOBs(example);
		if(list.size()>0){
			try {
				jedisClient.hset(REDIS_CONTENT_KEY, cid+"", JsonUtils.objectToJson(list));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/* 
	 * 同步redis
	 * (non-Javadoc)
	 * @see com.taotao.rest.service.ContentService#syncCOntent(java.lang.Long)
	 */
	@Override
	public TaotaoResult syncContent(Long cid) {
		jedisClient.hdel(REDIS_CONTENT_KEY, cid + "");
		return TaotaoResult.ok();
	}

}
