package com.cmb.test;

import com.cmb.service.UserService;

public class Test {

	public static void main(String[] args){
		
		//��ʹ�ô�ͳ�ķ�����������UserService��sayHello����
		UserService userService = new UserService();
		userService.setName("RaiseKing");
		userService.sayHello();
		
		//����ʹ��spring��������������
		
	}
}
