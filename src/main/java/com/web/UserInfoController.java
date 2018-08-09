package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.UserInfo;
import com.service.UserInfoService;

@Controller
@RequestMapping("/user")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/listuser")
	@ResponseBody
	public List<UserInfo> listUserInfo() {
		return userInfoService.listUserInfo();
	}
	
	@RequestMapping("toindex")
	public String toIndex() {
		return "index";
	}
	
}
