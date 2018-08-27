package com.cloud.configServer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties(prefix="spring.cloud.config.server.git")
public class GitHubConfig {
    private String uri;
    private String search_paths;
    private String username;
    private String password;
}
