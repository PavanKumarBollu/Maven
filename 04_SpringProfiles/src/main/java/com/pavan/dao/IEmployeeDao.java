package com.pavan.dao;

import java.util.List;

import com.pavan.bo.EmployeeBo;

public interface IEmployeeDao {
	public  List<EmployeeBo>  getEmpsByDesg(String cond)throws Exception;
}
