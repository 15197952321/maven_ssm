package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserInfoMapper;
import com.model.UserInfo;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public List<UserInfo> listUserInfo() {
		return userInfoMapper.selectByExample(null);
	}
	
}
