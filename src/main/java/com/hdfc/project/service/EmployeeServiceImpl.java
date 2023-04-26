package com.hdfc.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.project.entity.Employee;
import com.hdfc.project.exception.InValidEmployeeIDException;
import com.hdfc.project.repository.EmployeeRepository;
import com.hdfc.project.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException {
		Employee employee = employeeRepository.findById(employeeID).orElseThrow(
				() -> new InValidEmployeeIDException("Invalid EmployeeId : " + employeeID));
		EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeID(), employee.getEmployeeName(), employee.getDateOfBirth());
		return employeeVO;
	}
	

}

