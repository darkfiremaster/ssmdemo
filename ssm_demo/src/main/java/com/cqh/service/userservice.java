package com.cqh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cqh.dao.UserMapper;
import com.cqh.model.User;

@Service
@Transactional(readOnly = true)
public class userservice {
	@Autowired
	private UserMapper userMapper;
	
	public User selectuser(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
