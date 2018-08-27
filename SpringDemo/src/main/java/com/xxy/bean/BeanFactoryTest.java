package com.xxy.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiongxiaoyu
 * Data:2018/8/24
 * Time:19:23
 */

@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad(){

		ApplicationContext ac = new ClassPathXmlApplicationContext("bean/beanFactoryTest.xml");
		ac.getBean(MyTestBean.class);

//		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("bean/beanFactoryTest.xml"));
//		MyTestBean bean= (MyTestBean) bf.getBean("myTestBean");
//		assertEquals("test",bean.getStr());
	}
}
