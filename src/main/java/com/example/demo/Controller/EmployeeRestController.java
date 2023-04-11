package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.DepartementService;
import com.example.demo.Services.EmployeeService;
import com.example.demo.entities.Employee;
import com.example.demo.models.EmployeeModel;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(value="*")
public class EmployeeRestController {
@Autowired
	EmployeeService employeeService;
@Autowired
DepartementService departementService;
@PostMapping("/employees")
void createEmployee(@RequestBody EmployeeModel e) {
	Employee employee=new Employee();
	employee.setEmployeeLasttName(e.getEmployeeLastName());
	employee.setEmployeeFirstName(e.getEmployeeFirstName());
	employee.setEmployeePhone(e.getEmployeePhoneNumber());
	employee.setDepartement(this.departementService.findOneDepartement(e.getDepartementId()));
	
	this.employeeService.createEmployee(employee);
}
@GetMapping("/employees")
List<Employee> findAllEmployees(){
return this.employeeService.getEmployee();	
}
@GetMapping("/employees/{id}")
Employee getOneEmployee(@PathVariable long id) {
	return this.employeeService.getOneEmployee(id);
}
}
