package com.jerry.crm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MyStringUtils {

	public static String getMD5Value(String value) {

		try {
			// 1.获得jdk提供消息摘要算法工具类
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			// 2.加密结果10进制
			byte[] md5ValueByteArray = messageDigest.digest(value.getBytes());
			// 3.将10进制转化为16进制
			BigInteger bInteger = new BigInteger(1, md5ValueByteArray);
			return bInteger.toString(16);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
