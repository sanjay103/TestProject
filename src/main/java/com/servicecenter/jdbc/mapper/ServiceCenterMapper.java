package com.servicecenter.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.servicecenter.jdbc.dto.ServiceCenterDto;
import org.springframework.jdbc.core.RowMapper;

public class ServiceCenterMapper implements RowMapper<ServiceCenterDto>{
	
	
public ServiceCenterDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		System.out.println("Row number :" + rowNum);
		ServiceCenterDto scd=new ServiceCenterDto();
			scd.setScid(rs.getInt("scid"));
			scd.setMailId(rs.getString("mailId"));
			scd.setScName(rs.getString("scName"));
			scd.setAddress(rs.getString("address"));
			scd.setMobile(rs.getString("mobile"));
		return scd;
	}

	
}