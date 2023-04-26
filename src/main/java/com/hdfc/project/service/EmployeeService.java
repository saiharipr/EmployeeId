package com.hdfc.project.service;

import com.hdfc.project.exception.InValidEmployeeIDException;
import com.hdfc.project.vo.EmployeeVO;

public interface EmployeeService {

	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException;

}
