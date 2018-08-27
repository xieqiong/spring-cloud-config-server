package com.cloud.configServer.service;

import com.cloud.configServer.config.GitHubConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GitService {

    @Autowired
    private GitHubConfig gitHubConfig;

    public void gitCloneDefaultRepo(){
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);
    }
}