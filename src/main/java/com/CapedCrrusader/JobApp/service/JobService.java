package com.CapedCrrusader.JobApp.service;

import com.CapedCrrusader.JobApp.model.JobPost;
import com.CapedCrrusader.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobrepo;

    public void addjob(JobPost jobPost){
        jobrepo.addJobPost(jobPost);

    }
    public List<JobPost> getalljobpost(){
        return jobrepo.returnAllJobPosts();
    }
}
