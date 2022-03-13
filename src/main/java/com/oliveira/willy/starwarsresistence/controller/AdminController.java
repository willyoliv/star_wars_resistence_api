package com.oliveira.willy.starwarsresistence.controller;

import com.oliveira.willy.starwarsresistence.dto.AdminReport;
import com.oliveira.willy.starwarsresistence.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("admin")
public class AdminController {

    private final AdminService adminService;

    @GetMapping(path = "/issue-report")
    public ResponseEntity<AdminReport> issueReport() {
        return new ResponseEntity<>(adminService.issueReport(), HttpStatus.OK);
    }
}