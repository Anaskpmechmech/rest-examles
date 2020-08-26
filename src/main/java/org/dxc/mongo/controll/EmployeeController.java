package org.dxc.mongo.controll;


import java.util.List;
import java.util.Optional;

import org.dxc.mongo.model.Employee;
import org.dxc.mongo.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value="/addemployee")
	public void addEmployee(@RequestBody List<Employee> e) {
		employeeService.saveEmployee(e);
		
	}
	@GetMapping(value="/getallemployees")
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeService.getAllEmployees();
	}
	@GetMapping(value="/findemployeebyid/{id}")
	public Employee findEmployeeById(@PathVariable("id")int id){
		return employeeService.findEmployeeById(id).get();
		
	}
	@DeleteMapping(value="deleteemployeebyid/{id}")
	public void deleteEmployeeById(@PathVariable("id")int id) {
		employeeService.deleteEmployeeById(id);
	}
	@PutMapping(value="/updateemployee/{id}")
	public void updateEmployee(@PathVariable("id")int id,@RequestBody Employee employee) {
		employeeService.updateEmployee(id,employee);
	}

}
