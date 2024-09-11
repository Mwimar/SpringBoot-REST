package com.mwimar.springboot_rest;

import com.mwimar.springboot_rest.model.JobPost;
import com.mwimar.springboot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class JobRestController {
    @Autowired
    private JobService service;

    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
}
