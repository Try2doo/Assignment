package com.vastika.user_demo_jdbc;

import java.util.Scanner;

import com.vastika.user_demo_jdbc.dao.UserDao;
import com.vastika.user_demo_jdbc.dao.UserDaoImpl;
import com.vastika.user_demo_jdbc.model.User;

/**
 * Hello world!
 *
 */
public class UserController {
	public static void main(String[] args) {

		UserDao userDao = new UserDaoImpl();
		Scanner reader = new Scanner(System.in);
		User user = new User();

		System.out.println("Enter User Name:");
		String username = reader.next();
		System.out.println("Enter User password:");
		String password = reader.next();
		System.out.println("Enter User address:");
		String address = reader.next();
		System.out.println("Enter User mobile no:");
		Long mobileNo = reader.nextLong();

		user.setUsername(username);
		user.setPassword(password);
		user.setAddress(address);
		user.setMobileNo(mobileNo);

		int saved = userDao.saveUserInfo(user);
		if (saved>=1) {
			System.out.println("User info is saved Successively.");
		}else
			System.out.println("Error in DB!!!");

	}
}
