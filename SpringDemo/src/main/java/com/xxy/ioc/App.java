package com.xxy.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/8/24
 * Time:16:38
 */
public class App
{
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc/spring-config.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.login();
	}
}