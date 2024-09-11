package com.mwimar.springboot_rest.service;



import com.mwimar.springboot_rest.model.JobPost;
import com.mwimar.springboot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo service;

    public void addJob(JobPost jobPost){
        service.addJob(jobPost);

    };

    public List<JobPost> getAllJobs(){
        return service.getallJobs();
    };
}
