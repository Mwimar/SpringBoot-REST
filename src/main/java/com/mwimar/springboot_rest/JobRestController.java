package com.mwimar.springboot_rest;

import com.mwimar.springboot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JobRestController {
    @Autowired
    private JobService service;
    public String getAllJobs(){

    }
}
