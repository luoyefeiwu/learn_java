package com.taotao.sso.service.impl;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.CookieUtils;
import com.taotao.common.utils.JsonUtils;
import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserExample;
import com.taotao.pojo.TbUserExample.Criteria;
import com.taotao.sso.component.JedisClient;
import com.taotao.sso.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private TbUserMapper userMapper;
	@Autowired
	private JedisClient jedisClient;

	@Value("${REDIS_SESSION_KEY}")
	private String REDIS_SESSION_KEY;
	@Value("${REDIS_SESSION_EXPIRE}")
	private Integer REDIS_SESSION_EXPIRE;

	/*
	 * 登陆 (non-Javadoc)
	 * 
	 * @see com.taotao.sso.service.LoginService#login(java.lang.String,
	 * java.lang.String, javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public TaotaoResult login(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {
		// 检验用户名和密码是否正确
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<TbUser> list = userMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return TaotaoResult.build(400, "用户名或密码错误");
		}
		TbUser user = list.get(0);
		// 校验密码
		if (!user.getPassword().equals(DigestUtils.md5DigestAsHex(password.getBytes()))) {
			return TaotaoResult.build(400, "用户名或密码错误");
		}
		// 生成Token
		String token = UUID.randomUUID().toString();

		// 将用户信息写入redis
		user.setPassword(null);
		jedisClient.set(REDIS_SESSION_KEY + ":" + token, JsonUtils.objectToJson(user));
		// 设置过期时间
		jedisClient.expire(REDIS_SESSION_KEY + ":" + token, REDIS_SESSION_EXPIRE);
		// 写入cookie
		CookieUtils.setCookie(request, response, "TT_TOKEN", token);
		return TaotaoResult.ok(token);
	}
}
