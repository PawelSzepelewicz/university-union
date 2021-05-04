package com.moshecorp.universityunion.repository;

import com.moshecorp.universityunion.model.user.Clients;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;


@Repository
    public interface ClientsRepository extends JpaRepository<Clients, Long> {
        Clients getById(Long id);
        @Query(value = "Select initials from Clients")
       List<String> selectInitials();
    }

