package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//通过id获取用户
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}
