package com.moshecorp.universityunion.repository.comments;

import com.moshecorp.universityunion.model.comments.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<Likes, Long> {
}
