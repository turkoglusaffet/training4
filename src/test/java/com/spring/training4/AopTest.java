package com.spring.training4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.training4.bean.CompanyBean;
import com.spring.training4.config.AppInitConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppInitConfig.class})

public class AopTest {

	@Autowired
	CompanyBean companyBean;
	
	@Test
	public void test() throws Exception{
		
		System.out.println(companyBean.getName());
	}
}
