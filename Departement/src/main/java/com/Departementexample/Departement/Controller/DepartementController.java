package com.Departementexample.Departement.Controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Departementexample.Departement.ModelEntity.DepartementEntity;
import com.Departementexample.Departement.Service.DepartementServiceClass;

//import jakarta.validation.Valid;

@RestController
public class DepartementController {
     @Autowired
    private DepartementServiceClass departementServiceClass;

   private final Logger logger=LoggerFactory.getLogger(DepartementController.class);

     @GetMapping("/Details/{Id}")
    public DepartementEntity getDetails(@PathVariable("Id") Long DepartementId)
    {
        return departementServiceClass.getDetails(DepartementId);

    }

    @PostMapping("/Details")
    public String createDetails( @RequestBody DepartementEntity departementEntity)
    {
        logger.info("inside the save method");
        return departementServiceClass.createDetails(departementEntity);

    }

    @PutMapping("/Details/{DepartementId}")
    public String updateDetails( @PathVariable Long DepartementId,@RequestBody DepartementEntity departementEntity)
    {
        return departementServiceClass.updateDetails(DepartementId,departementEntity);
    }
     @DeleteMapping("/Details/{DepartementId}")

     public String deleteDetails(@PathVariable("DepartementId")Long DepartementId)
     {
        return departementServiceClass.deleteDetails(DepartementId);

     }

  
 
    
}
