package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.UserInfoMapper;
import com.model.UserInfo;

@Service	
public class UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public List<UserInfo> listUserInfo() {
		PageHelper.startPage(1, 10);
		List<UserInfo> infos = userInfoMapper.selectByExample(null);
		PageInfo<UserInfo> info = new PageInfo<>(infos);
		System.out.println(info.getTotal());
		return info.getList();
	}
	
}
