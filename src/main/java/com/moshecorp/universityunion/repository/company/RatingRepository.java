package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}
