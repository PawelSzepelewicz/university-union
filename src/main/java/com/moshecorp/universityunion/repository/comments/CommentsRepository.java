package com.moshecorp.universityunion.repository.comments;

import com.moshecorp.universityunion.model.comments.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
}
