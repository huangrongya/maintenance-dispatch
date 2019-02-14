package com.tepth.maintenancedispatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MaintenanceDispatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaintenanceDispatchApplication.class, args);
    }

}

