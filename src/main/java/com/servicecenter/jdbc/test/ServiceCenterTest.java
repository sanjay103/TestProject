package com.servicecenter.jdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.servicecenter.jdbc.controller.ServiceCenterController;

public class ServiceCenterTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/servicecenter/jdbc/common/application-context.xml");
		ServiceCenterController controller=(ServiceCenterController) context.getBean("serviceCenterController");
		System.out.println(controller.getServiceCenter());
	}

}
