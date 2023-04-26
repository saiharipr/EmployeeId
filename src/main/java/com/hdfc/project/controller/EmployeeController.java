package com.hdfc.project.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.hdfc.project.entity.Employee;
import com.hdfc.project.exception.EmployeeIDException;
import com.hdfc.project.exception.InValidEmployeeIDException;
import com.hdfc.project.service.EmployeeService;
import com.hdfc.project.vo.EmployeeVO;
import com.mysql.cj.log.Log;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/capstone/Employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	private static final Logger Logger = LoggerFactory.getLogger(EmployeeController.class);

	@GetMapping("/get/{employeeID}")
	public EmployeeVO getEmployeeById(@PathVariable long employeeID)
			throws EmployeeIDException, InValidEmployeeIDException {
		
		Logger.info("Getting user by ID: {}",employeeID+ " checking...........");
		
		return employeeService.getEmployeeById(employeeID);
	}

}
