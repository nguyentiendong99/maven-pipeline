package com.example.jenkinspipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsPipelineApplication {

    @GetMapping("/jenkins")
    public String testJenkins() {
        return "nguyen tien dong demo jenkins pipeline";
    }
    public static void main(String[] args) {
        SpringApplication.run(JenkinsPipelineApplication.class, args);
    }

}
