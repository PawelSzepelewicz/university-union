package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
