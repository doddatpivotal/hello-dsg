package io.pivotal.hellodsg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloDSGApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDSGApplication.class, args);
    }

}

@RestController
class BookController {

    @Value("${HOSTNAME:no host}")
    String podname;

    String version = "v2";

    @GetMapping("/")
    public String hello() {
        return "Hello DSG! You are running on pod " + podname + " and version is " + version + "." ;
    }

}

