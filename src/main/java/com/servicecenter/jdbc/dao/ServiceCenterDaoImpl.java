package com.servicecenter.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.servicecenter.jdbc.dto.ServiceCenterDto;
import com.servicecenter.jdbc.mapper.ServiceCenterMapper;

@Repository/*("serviceCenterDao")*/
public class ServiceCenterDaoImpl implements ServiceCenterDao {
	
	private final static String query="select * from servicecenterbo";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<ServiceCenterDto> getServiceCenter() {
		return (List<ServiceCenterDto>) jdbcTemplate.query(query,new ServiceCenterMapper());
		}

}
 