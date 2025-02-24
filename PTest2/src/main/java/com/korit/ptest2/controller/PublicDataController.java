package com.korit.ptest2.controller;

import com.korit.ptest2.service.PublicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicDataController {

    @Autowired
    private PublicDataService publicDataService;

    @GetMapping("/fetch-data")
    public String fetchData() {
        publicDataService.fetchAndSaveData();
        return "데이터 저장 작업 완료!";
    }
}
