/**
 * 
 */
package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.Employee;

/**
 * @author Mehul
**/

public interface EmployeeService {

	/**
	 * @param employee
	 */
	void save(Employee employee);

	/**
	 * @return
	 */
	List<Employee> findAll();

	/**
	 * @param empId
	 */
	void deleteById(int empId);

	/**
	 * @param empId
	 * @return
	 */
	Optional<Employee> findEmployeeById(int empId);

}
