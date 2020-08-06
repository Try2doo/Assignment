package com.vastika.user_demo_jdbc.service;

import java.util.List;

import com.vastika.user_demo_jdbc.dao.UserDao;
import com.vastika.user_demo_jdbc.dao.UserDaoImpl;
import com.vastika.user_demo_jdbc.model.User;

public class UserServiceImpl implements UserService {

	UserDao UserDao = new UserDaoImpl();
	
	@Override
	public int saveUserInfo(User user) {
		
		return UserDao.saveUserInfo(user);
	}

	@Override
	public int updateUserInfo(User user) {
		
		return UserDao.updateUserInfo(user);
	}

	@Override
	public void deleteUserInfo(int id) {
	

	}

	@Override
	public User getUserById(int id) {
		
		return UserDao.getUserById(id);
	}

	@Override
	public List<User> getAllUserInfo() {
		
		return UserDao.getAllUserInfo();
	}

}
