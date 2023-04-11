package com.example.demo.Repositories;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Employee;
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
