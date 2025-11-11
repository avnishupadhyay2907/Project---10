package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_emp")
public class EmployeeDTO extends BaseDTO {

	@Column(name = "FULLNAME", length = 100)
	private String fullName = null;

	@Column(name = "USERNAME", length = 100)
	private String userName = null;

	@Column(name = "PASSWORD", length = 100)
	private String password = null;

	@Column(name = "BIRTHDATE")
	private String birthDate = null;

	@Column(name = "CONTACTNUMBER", length = 100)
	private String contactNumber = null;

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return fullName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		// TODO Auto-generated method stub
		return null;
	}

}
