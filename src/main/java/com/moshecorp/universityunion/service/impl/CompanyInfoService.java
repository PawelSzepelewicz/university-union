package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.company.CompanyInfo;
import com.moshecorp.universityunion.repository.company.CompanyPhotoRepository;
import com.moshecorp.universityunion.repository.company.CompanyRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyInfoServiceImpl implements CompanyInfoService{

    CompanyService companyRepository;
    CompanyPhotoRepository companyPhotoRepository;

    CompanyInfo getCompanyInfoById(Long id){
        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.setCompany(companyService.getCompanyById(id));
        companyInfo.setCompanyPhoto(companyPhotoRepository.getCompanyPhotoByCompanyId(id));
        List<Comments> commentsList = commntsService.getCommentsByCompanyId(id);
        Map<Comments, Integer> commentsAndLikes = new HashMap<>();
        commentsList.forEach(comment -> {
            Integer countOfLikes= likesService.getCountOfLikesForCurrentComment(comment.getId());
            commentsAndLikes.put(comment, countOfLikes);
        });
        companyInfo.setCommentsAndLikes(commentsAndLikes);
        return companyInfo;
    }
}
