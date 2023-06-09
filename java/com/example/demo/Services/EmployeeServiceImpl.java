package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.EmployeeRepository;
import com.example.demo.entities.Departement;
import com.example.demo.entities.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
 EmployeeRepository employeeRepository;
	@Override
	public void createEmployee(Employee e) {
	this.employeeRepository.save(e);
		
	}

	public List<Employee> getEmployees() {
		return this.employeeRepository.findAll();
	}

	@Override
	public Employee getOneEmployee(long id) {
		return this.employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	
}