package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
