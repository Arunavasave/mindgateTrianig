package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImp implements ApplicationService{

	@Override
	public void processApplication() {
		// TODO Auto-generated method stub 
		System.out.println("process Application form");
		
	}
	@Auditable(value = "check")
	public String processApplicationWithAudit() {
		System.out.println("process ApplicationForm in Service");
		return "success";
		
	}
	

}
