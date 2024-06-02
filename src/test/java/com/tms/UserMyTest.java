package com.tms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tms.bean.User;
import com.tms.controller.UserController;

@SpringBootTest
class UserMyTest {

	@Autowired
	UserController usercontroller;

	List<User> list = new ArrayList<User>();

	// to insert the user data
	@Test
	void doUserInsert() {
		User user = new User();
		user.setUserId(6);
		user.setUserName("kavi");
		user.setUserPassword("kavi123");
		user.setUserMobile("987654321");
		user.setUserEmail("karpagambs26@gmail.com");
		user.setUserAddress("Tenkasi");

		User result = usercontroller.insertUser(user);
		assertEquals(user, result);
	}

	// to get all details of user

//	@Test
//	void doGetUsers() {
//		List<User> users = usercontroller.getUsers();
//		assertNotNull(users);
//		assertEquals(6, users.size());
//	}
	
	// update the user details
	@Test
	void doUpdateUser() {
		User user = new User();

		user.setUserId(12);
		user.setUserName("kaviya");
		user.setUserPassword("kavi123");
		user.setUserMobile("987654321");
		user.setUserEmail("karpagambs26@gmail.com");
		user.setUserAddress("Tenkasii");

		User result = usercontroller.updateUser(user);
		assertEquals(user, result);
	}
	
	//Get list by user Id
	@Test
	void getListByUserId() {
		User user=new User();
		user =usercontroller.find(12);
        System.out.println(user);
		assertNotNull(user);

	}
	
	//check with username & password
	 @Test
	    void testLoginUser() {
	        User user = new User();
	        user = usercontroller.loginUser("kaviya", "12345");
	        assertNotNull(user);
	    }


}
