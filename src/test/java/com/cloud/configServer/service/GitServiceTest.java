package com.cloud.configServer.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
public class GitServiceTest {

    @Autowired
    private GitService gitService;

    @Test
    public void gitCloneDefaultRepoTest(){
        gitService.gitCloneDefaultRepo();
    }
}
