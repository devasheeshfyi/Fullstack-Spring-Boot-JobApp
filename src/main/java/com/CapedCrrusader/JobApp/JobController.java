package com.CapedCrrusader.JobApp;

import com.CapedCrrusader.JobApp.model.JobPost;
import com.CapedCrrusader.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobservice;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleform(JobPost jobPost){
        jobservice.addjob(jobPost);
        return "success";
    }
    @GetMapping("viewalljobs")
    public String viewalljobs(Model m){
        List<JobPost> jobs=jobservice.getalljobpost();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";

    }

}
