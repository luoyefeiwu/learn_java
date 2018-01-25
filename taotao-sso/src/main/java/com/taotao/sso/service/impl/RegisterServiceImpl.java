package com.taotao.sso.service.impl;

import java.util.Date;
import java.util.List;

import javax.imageio.spi.RegisterableService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserExample;
import com.taotao.pojo.TbUserExample.Criteria;
import com.taotao.sso.service.RegisterService;
@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private TbUserMapper  userMapper; 
	@Override
	public TaotaoResult checkData(String param, int type) {
		TbUserExample example=new TbUserExample();
		Criteria criteria=example.createCriteria();

		//1、2、3分别代表username、phone、email
		if(type==1){
			criteria.andUsernameEqualTo(param);
		}else if(type==2){
			criteria.andPhoneEqualTo(param);
		}else if(type==3){
			criteria.andEmailEqualTo(param);
		}
		//执行查询
		List<TbUser> list=userMapper.selectByExample(example);
		if(list==null || list.isEmpty()){
			return TaotaoResult.ok(true);
		}else{
			return TaotaoResult.ok(false);
		}
	}
	/* 注册
	 * (non-Javadoc)
	 * @see com.taotao.sso.service.RegisterService#register(com.taotao.pojo.TbUser)
	 */
	@Override
	public TaotaoResult register(TbUser user) {
		//有效性验证
		if (StringUtils.isBlank(user.getUsername())) {
			return TaotaoResult.build(400, "用户名不能为空");
		}
		if (StringUtils.isBlank(user.getPassword())) {
			return TaotaoResult.build(400, "密码不能为空");
		}
		//密码进行md5加密
		String password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
		user.setPassword(password);
		
		//补全user对象中的信息
		user.setCreated(new Date());
		user.setUpdated(new Date());
		//把用户信息插入到数据库
		userMapper.insert(user);
		
		return TaotaoResult.ok();
	}

}
