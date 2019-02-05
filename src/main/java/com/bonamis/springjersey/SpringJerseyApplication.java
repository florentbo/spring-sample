package com.bonamis.springjersey;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringJerseyApplication  extends SpringBootServletInitializer {

        public static void main(String[] args) {
            new SpringJerseyApplication()
                    .configure(new SpringApplicationBuilder(SpringJerseyApplication.class))
                    .run(args);
        }



}

