package com.servicecenter.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicecenter.jdbc.dao.ServiceCenterDao;
import com.servicecenter.jdbc.dto.ServiceCenterDto;

@Service
public class ServiceCenterService {
	
	@Autowired
	private ServiceCenterDao serviceCenterDao;
	public List<ServiceCenterDto> getServiceCenter() {
		return serviceCenterDao.getServiceCenter();
	}

}
