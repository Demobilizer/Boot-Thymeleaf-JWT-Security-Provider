/**
 * 
 */
package com.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepo;
import com.demo.service.EmployeeService;

/**
 * @author Mehul
**/

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public void save(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

	@Override
	public void deleteById(int empId) {
		employeeRepo.deleteById(empId);
	}

	@Override
	public Optional<Employee> findEmployeeById(int empId) {
		return employeeRepo.findById(empId);
	}
	
	

}
