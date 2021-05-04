package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.enums.Category;
import com.moshecorp.universityunion.enums.Roles;
import com.moshecorp.universityunion.model.abstarct.AbstractEntity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "company")
public class Company extends AbstractEntity {

    private Long userId;
    private String name;
    private Category category;
    private Timestamp creationDate;
    private Timestamp expirationDate;
    private Double targetSum;
    private Double currentSum;
    private String description;
    
}
