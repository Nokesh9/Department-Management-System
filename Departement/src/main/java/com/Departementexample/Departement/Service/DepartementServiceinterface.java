package com.Departementexample.Departement.Service;



import com.Departementexample.Departement.ModelEntity.DepartementEntity;

public interface DepartementServiceinterface   {
     public DepartementEntity getDetails(Long DepartementId);
     public String createDetails(DepartementEntity departementEntity);
     public String updateDetails(Long DepartementId, DepartementEntity departementEntity);
     public String deleteDetails(Long departementId);
     public DepartementEntity getDetailsByName(String departementName);

    
} 
    


