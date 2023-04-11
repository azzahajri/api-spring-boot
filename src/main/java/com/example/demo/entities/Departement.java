package com.example.demo.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "departement")
public class Departement implements Serializable{
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
private Long id;
private String departementName;
@JsonBackReference
@OneToMany(mappedBy="departement")
Collection<Employee> employees=new ArrayList<>();
public String getDepartementName() {
return departementName;
}
public void setDepartementName(String departementName) {
this.departementName = departementName;
}
public Collection<Employee> getEmployees() {
return employees;
}
public void setEmployees(Collection<Employee> employees) {
this.employees = employees;
}
}