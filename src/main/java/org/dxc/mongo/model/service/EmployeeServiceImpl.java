package org.dxc.mongo.model.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongo.model.Employee;
import org.dxc.mongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(List<Employee> employee) {
		employeeRepository.saveAll(employee);

	}

	@Override
	public Collection<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findEmployeeById(int id) {
		System.out.println(id);
		return employeeRepository.findById(id);
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);

	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		Employee e = employeeRepository.findById(id).get();
		if (employee.getFirstName() != null) e.setFirstName(employee.getFirstName());
		if (employee.getLastName() != null) e.setLastName(employee.getLastName());
		if (employee.getJobTitle() != null) e.setJobTitle(employee.getJobTitle());
		if (employee.getSalary() != 0) e.setSalary(employee.getSalary());
		employeeRepository.save(e);
	}
}
