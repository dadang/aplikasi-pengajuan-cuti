package com.artivisi.aplikasi.pengajuan.cuti.test;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.artivisi.aplikasi.pengajuan.cuti.service.AppService;

public class TestApplicationContext {
	private static ApplicationContext applicationContext;
	private static AppService appService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath*:com/artivisi/**/applicationContext.xml");
		appService = (AppService) applicationContext.getBean("appService");
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test(){
		
	}
}
