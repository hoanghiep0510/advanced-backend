package org.hoanghiep.advanced_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AdvancedBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvancedBackendApplication.class, args);
    }

}
