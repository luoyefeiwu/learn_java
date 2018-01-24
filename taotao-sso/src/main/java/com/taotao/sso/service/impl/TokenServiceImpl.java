package com.taotao.sso.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.pojo.TbUser;
import com.taotao.sso.component.JedisClient;
import com.taotao.sso.service.TokenService;

@Service
public class TokenServiceImpl implements TokenService {
	@Autowired
	private JedisClient jedisClient;

	@Value("${REDIS_SESSION_KEY}")
	private String REDIS_SESSION_KEY;
	@Value("${SESSION_EXPIRE}")
	private Integer SESSION_EXPIRE;

	/*
	 * 通过Token得到用户信息 (non-Javadoc)
	 * 
	 * @see com.taotao.sso.service.LoginService#getUserByToken(java.lang.String)
	 */
	@Override
	public TaotaoResult getUserByToken(String token) {

		String json = jedisClient.get(REDIS_SESSION_KEY + ":" + token);
		if (StringUtils.isBlank(json)) {
			return TaotaoResult.build(400, "用户session已过期");
		}
		TbUser user=JsonUtils.jsonToPojo(json, TbUser.class);
		//更新session过期时间
		jedisClient.expire(REDIS_SESSION_KEY + ":" + token,SESSION_EXPIRE);
		return TaotaoResult.ok(user);
	}

	@Override
	public TaotaoResult deleteUserToken(String token) {
		jedisClient.decr(REDIS_SESSION_KEY+":"+token);
		return TaotaoResult.ok();
	}

}
