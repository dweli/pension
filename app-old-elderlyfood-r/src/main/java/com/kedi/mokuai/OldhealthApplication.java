package com.kedi.mokuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



/**
 * 
 *
 * @ClassName	OldhealthApplication
 * @author:		陈辽逊
 * @date: 		2019/7/13 10:33
 */
@EnableEurekaClient
@SpringBootApplication
public class OldhealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(OldhealthApplication.class, args);

	}

}
