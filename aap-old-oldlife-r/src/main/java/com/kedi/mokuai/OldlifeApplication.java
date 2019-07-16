package com.kedi.mokuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



/**
 * 
 *
 * @ClassName	OldlifeApplication
 * @author: 	陈辽逊
 * @date: 		2019/7/13 12:32
 */
@EnableEurekaClient
@SpringBootApplication
public class OldlifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OldlifeApplication.class, args);

	}

}
