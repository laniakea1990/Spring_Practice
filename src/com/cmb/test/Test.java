package com.cmb.test;

import com.cmb.service.UserService;

public class Test {

	public static void main(String[] args){
		
		//先使用传统的方法，来调用UserService的sayHello方法
		UserService userService = new UserService();
		userService.setName("RaiseKing");
		userService.sayHello();
		
		//现在使用spring来完成上面的任务
		
	}
}
