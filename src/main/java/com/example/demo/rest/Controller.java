package com.example.demo.rest;

import com.example.demo.dto.RepoInfo;
import com.example.demo.dto.RepoSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/repositories")
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{owner}/{repo}")
    public RepoInfo getRepoInfo(@PathVariable("owner") String owner, @PathVariable("repo") String repo){

        RepoSummary repoSummary = restTemplate.getForObject("https://api.github.com/repos/" + owner + "/" + repo, RepoSummary.class);
        return new RepoInfo(repoSummary.getName(), repoSummary.getDes(), repoSummary.getClone_url(), repoSummary.getStargazers_count(), repoSummary.getCreated_at());
    }

}
