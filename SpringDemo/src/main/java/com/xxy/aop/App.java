package com.xxy.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/1
 * Time:16:16
 */
public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/aop/aop.xml");
		InvokableMethod defaultInvokeMethod = (InvokableMethod) applicationContext.getBean("defaultInvokeMethod");
		defaultInvokeMethod.invokeMethod();
	}
}
