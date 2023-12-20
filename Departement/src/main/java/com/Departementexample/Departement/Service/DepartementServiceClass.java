package com.Departementexample.Departement.Service;


import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Departementexample.Departement.ModelEntity.DepartementEntity;
import com.Departementexample.Departement.RepositoryDepartement.RepositoryDepartement;

@Service
public class DepartementServiceClass implements DepartementServiceinterface {
    @Autowired
    private RepositoryDepartement repositoryDepartement;

    public DepartementEntity getDetails(Long DepartementId) 
    {
      return repositoryDepartement.findById(DepartementId).get();
    }

    public String createDetails(DepartementEntity departementEntity) {

        repositoryDepartement.save(departementEntity);
        return "DETAILS ARE SAVED";
    }

    public String updateDetails(Long DepartementId, DepartementEntity departementEntity) {
            
       


      Optional< DepartementEntity > dep= repositoryDepartement.findById(DepartementId);
      DepartementEntity de=dep.get();

      if(Objects.nonNull(departementEntity.getDepartementName()) && !" ".equalsIgnoreCase(departementEntity.getDepartementName()))
        {
       
            de.setDepartementName(departementEntity.getDepartementName());
      }
      if(Objects.nonNull(departementEntity.getDepartementCode()) && !" ".equalsIgnoreCase(departementEntity.getDepartementCode()))
        {
       
            de.setDepartementName(departementEntity.getDepartementCode());
      }
      repositoryDepartement.save(departementEntity);
    return "updatedS";
   // return DepartementId;


      
    }

    public String deleteDetails(Long departementId) {
         repositoryDepartement.deleteById(departementId);

        return "Deleted";
    }

    public DepartementEntity getDetailsByName(String departementName) {


        return null;
    }
 
}
