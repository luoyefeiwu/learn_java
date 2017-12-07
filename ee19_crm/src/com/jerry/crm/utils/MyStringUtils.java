package com.jerry.crm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MyStringUtils {

	public static String getMD5Value(String value) {

		try {
			// 1.���jdk�ṩ��ϢժҪ�㷨������
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			// 2.���ܽ��10����
			byte[] md5ValueByteArray = messageDigest.digest(value.getBytes());
			// 3.��10����ת��Ϊ16����
			BigInteger bInteger = new BigInteger(1, md5ValueByteArray);
			return bInteger.toString(16);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
