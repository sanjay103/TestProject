package com.servicecenter.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.servicecenter.jdbc.dto.ServiceCenterDto;
import com.servicecenter.jdbc.service.ServiceCenterService;

@Controller
public class ServiceCenterController {
	
	@Autowired
	private ServiceCenterService serviceCenterService;
	
	public List<ServiceCenterDto> getServiceCenter() {
		return serviceCenterService.getServiceCenter();
	}

}
