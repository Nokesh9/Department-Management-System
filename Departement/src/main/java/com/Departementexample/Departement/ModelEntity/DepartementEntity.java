package com.Departementexample.Departement.ModelEntity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartementEntity {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private long DepartementId;

    //@NotBlank(message = "PLEASE ADD THE DOCUMENT ")
    private String DepartementName;
    private String DepartementCode;
    
   
    
    
}
