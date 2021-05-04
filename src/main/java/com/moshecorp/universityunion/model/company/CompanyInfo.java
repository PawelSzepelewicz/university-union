package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.comments.Likes;
import lombok.Data;

import java.util.List;

@Data
public class CompanyInfo {

    Company company;
    List<CompanyPhoto> companyPhoto;
    CompanyVideo companyVideo;
    CompaniesTags companyTags;
    List<Comments> comments;
    Long likes;
    int rating;

}
