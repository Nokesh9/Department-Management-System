package com.Departementexample.Departement.RepositoryDepartement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Departementexample.Departement.ModelEntity.DepartementEntity;

@Repository
public interface RepositoryDepartement extends JpaRepository<DepartementEntity, Long>{
    

    
    
}

