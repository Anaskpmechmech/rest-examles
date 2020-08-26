package org.dxc.mongo.model.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongo.model.Employee;

public interface EmployeeService {
	public void saveEmployee(List<Employee>employee);
	public Collection<Employee> getAllEmployees();
	public Optional<Employee> findEmployeeById(int id);
	void deleteEmployeeById(int id);
	void updateEmployee(int id,Employee employee);
	

}
