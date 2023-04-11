package com.example.demo.Services;
import com.example.demo.entities.Departement;
import java.util.List;

public interface DepartementService {
void createDepartement(Departement d);
List<Departement> findDepartements();
Departement findOneDepartement(long id);
}
