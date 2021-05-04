package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.model.company.CompanyInfo;
import com.moshecorp.universityunion.repository.company.CompanyPhotoRepository;
import com.moshecorp.universityunion.repository.company.CompanyRepository;

public class CompanyInfoService {

    CompanyService companyRepository;
    CompanyPhotoRepository companyPhotoRepository;

    CompanyInfo getCompanyInfoById(Long id){
        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.setCompany(companyService.getCompanyById(id));
        companyInfo.setCompanyPhoto(companyPhotoRepository.getCompanyPhotoByCompanyId(id));

        return companyInfo;
    }
}
