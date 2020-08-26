package org.dxc.mongo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="employee")
public class Employee {
	@Id
	private int employeeId;
	@Field("firstname")
	private String firstName;
	@Field("lastname")
	private String lastName;
	@Field("jobtitle")
	private String jobTitle;
	@Field("salary")
	private double salary;
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}

	

}
