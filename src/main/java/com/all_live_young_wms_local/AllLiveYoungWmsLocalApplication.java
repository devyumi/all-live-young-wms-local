package com.all_live_young_wms_local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AllLiveYoungWmsLocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllLiveYoungWmsLocalApplication.class, args);
    }

}
