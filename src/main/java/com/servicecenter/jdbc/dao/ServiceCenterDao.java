package com.servicecenter.jdbc.dao;

import java.util.List;

import com.servicecenter.jdbc.dto.ServiceCenterDto;

public interface ServiceCenterDao {
	
	public List<ServiceCenterDto> getServiceCenter();
}
