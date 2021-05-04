package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.comments.Comments;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CompanyInfo {

    Company company;
    List<CompanyPhoto> companyPhoto;
    CompanyVideo companyVideo;
    CompaniesTags companyTags;
    Map<Comments, Integer> commentsAndLikes;
    Long likes;
    int rating;

}
