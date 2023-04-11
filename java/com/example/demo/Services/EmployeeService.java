package com.example.demo.Services;
import com.example.demo.entities.Employee;
import java.util.List;
public interface EmployeeService {
 void createEmployee(Employee e);
 List<Employee> getEmployee();
 Employee getOneEmployee(long id);
}
