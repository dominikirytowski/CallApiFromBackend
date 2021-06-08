package com.example.demo.dto;

public class RepoSummary {
    private String full_name;
    private String description;
    private String clone_url;
    private Integer stargazers_count;
    private String created_at;

    public void setName(String name) {
        this.full_name = name;
    }

    public void setDes(String des) {
        this.description = des;
    }

    public void setClone_url(String clone_url) {
        this.clone_url = clone_url;
    }

    public void setStargazers_count(Integer stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getName() {
        return full_name;
    }

    public String getDes() {
        return description;
    }

    public String getClone_url() {
        return clone_url;
    }

    public Integer getStargazers_count() {
        return stargazers_count;
    }

    public String getCreated_at() {
        return created_at;
    }
}
