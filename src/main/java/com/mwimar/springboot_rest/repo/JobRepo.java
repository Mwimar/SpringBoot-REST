package com.mwimar.springboot_rest.repo;


import com.mwimar.springboot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
        List <JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1,"Java Dev", "Must Know Java",3, Arrays.asList("java", "sql")),
                new JobPost(2,"Backend Dev", "Must Know Backend",3, Arrays.asList("Spring", "sql")),
                new JobPost(3,"SpringBoot", "Must Know SpringBoot",3, Arrays.asList("springboot", "java")),
                new JobPost(4,"Frontend", "Must Know Frontend",3, Arrays.asList("css", "javascript"))
        ));

    public JobPost getJob(int postId) {

        for(JobPost job : jobs){
            if(job.getPostId()== postId){

                return job;
            }
        }
            return null;
    }

    public List<JobPost> getallJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobPost1:jobs){
            if(jobPost1.getPostId()==jobPost.getPostId()){
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());

            }
        }
    }

    public void deleteJob(int postId) {
        for(JobPost jobPost: jobs){
            if(jobPost.getPostId()==postId){
                jobs.remove(jobPost);
            }
        }
    }
}
