package com.korit.fileupload_back.controller;

import com.korit.fileupload_back.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;


    @GetMapping("/member/{id}")
    public ResponseEntity<?> getMember(@PathVariable Long id){
        return ResponseEntity.ok(memberService.getMemberDto(id));
    }
}
