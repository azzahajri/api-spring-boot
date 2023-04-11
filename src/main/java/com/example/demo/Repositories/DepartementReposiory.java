package com.example.demo.Repositories;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Departement;
@Transactional
public interface DepartementReposiory extends JpaRepository<Departement, Long>{
	
}

