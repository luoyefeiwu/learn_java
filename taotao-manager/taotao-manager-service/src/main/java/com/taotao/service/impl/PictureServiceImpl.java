package com.taotao.service.impl;

import java.io.IOException;

import org.csource.common.MyException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.pojo.PictureResult;
import com.taotao.common.utils.FastDFSClient;
import com.taotao.service.PictureService;

/*
 * 图片上传
 * */
@Service
public class PictureServiceImpl implements PictureService {

	@Value("${IMAGE_SERVER_BASE_URL}")
	private String IMAGE_SERVER_BASE_URL;
	
	@Override
	public PictureResult uploadPicture(MultipartFile picFile) {
		PictureResult result = new PictureResult();
		// 判断图片是否为空
		if (picFile.isEmpty()) {
			result.setError(1);
			result.setMessage("图片为空");
			return result;
		}
		// 上传到图片服务器
		try {
			// 取 图片扩展名
			String originalFilename = picFile.getOriginalFilename();
			String extName = originalFilename.substring(originalFilename.lastIndexOf('.') + 1);
			FastDFSClient client = new FastDFSClient("classpath:properties/client.conf");
			String url = client.uploadFile(picFile.getBytes(), extName);
			//拼接图片服务器IP地址
			url=IMAGE_SERVER_BASE_URL+url;
			result.setError(0);
			result.setUrl(url);
		} catch (Exception e) {
			result.setError(1);
			result.setMessage("图片上传失败");
			e.printStackTrace();
		}
		return result;
	}

}
