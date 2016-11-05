package com.spring.training4.bean;

import org.springframework.stereotype.Component;

@Component
public class CompanyBean {

	private String name;
	
	public CompanyBean(){
		super();
	}
	
	public String getName() throws Exception {
		System.out.println("Execute getName function");
		
		throw new Exception("exception");
	}

	public void setName(String name) {
		this.name = name;
	}

}
