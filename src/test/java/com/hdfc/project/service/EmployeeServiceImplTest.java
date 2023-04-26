package com.hdfc.project.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.project.exception.InValidEmployeeIDException;
import com.hdfc.project.repository.EmployeeRepository;
import com.hdfc.project.vo.EmployeeVO;

@SpringBootTest
class EmployeeServiceImplTest {

	
	@Autowired
	EmployeeService employeeService;

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void testGetByEmployeeID() throws InValidEmployeeIDException {
		EmployeeVO employeeID = employeeService.getEmployeeById(2891);
		
		assertEquals("Nandan",employeeID.getEmployeeName());
		
	}
	

}
