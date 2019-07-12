package com.kedi.mokuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



/**
 * 
 * @author 陈辽逊
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class ColectionrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColectionrApplication.class, args);

	}

}
