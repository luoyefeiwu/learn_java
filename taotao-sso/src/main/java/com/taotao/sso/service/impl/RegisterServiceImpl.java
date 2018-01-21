package com.taotao.sso.service.impl;

import java.util.List;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
