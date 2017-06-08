package com.cqh.test;

import javax.annotation.Resource;
import javax.validation.constraints.Null;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cqh.model.User;
//注释内容为非注解模式测试
import com.cqh.service.userservice;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类 
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class AllTests {	
	private static Logger logger=Logger.getLogger(AllTests.class);
//  private ApplicationContext ac = null;  
	
	@Autowired
	private userservice userservice;
	
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
	
	@Test
	public void test1(){
		User user =new User();
		user=userservice.selectuser(1);
		System.out.println(user.getPassword());
		logger.info("值为："+user.getPassword());
	}
	 
}
