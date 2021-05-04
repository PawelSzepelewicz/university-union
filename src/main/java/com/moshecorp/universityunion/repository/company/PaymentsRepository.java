package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentsRepository extends JpaRepository<Payments, Long> {
}
