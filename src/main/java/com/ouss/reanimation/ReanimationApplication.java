package com.ouss.reanimation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//I am meanwhile excluding the datasource auto configuration
@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class ReanimationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReanimationApplication.class, args);
    }

}
