package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class BaseServiceTest {
	private Long startTime;
	
	@Before
	public void before(){
		startTime = System.currentTimeMillis();
	}
	
	@After
	public void after(){
		System.out.println("方法执行了"+(System.currentTimeMillis()-startTime)+ "毫秒！");
	}
}
