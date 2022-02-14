package com.codeclan.example.employeetracker;

import com.codeclan.example.employeetracker.models.Employee;
import com.codeclan.example.employeetracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveEmployee() {
		Employee bill = new Employee("Bill", 35, 89076, "bill@bill.com");
		employeeRepository.save(bill);
	}

}
