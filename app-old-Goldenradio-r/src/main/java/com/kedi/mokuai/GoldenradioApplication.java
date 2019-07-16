package com.kedi.mokuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



/**
 * 
 *
 * @ClassName	GoldenradioApplication
 * @author: 	陈辽逊
 * @date: 		2019/7/13 10:55
 */
@EnableEurekaClient
@SpringBootApplication
public class GoldenradioApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldenradioApplication.class, args);

	}

}
