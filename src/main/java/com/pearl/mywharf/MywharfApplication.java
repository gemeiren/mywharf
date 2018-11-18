package com.pearl.mywharf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 
 * https://blog.csdn.net/a67474506/article/details/52013493
 */
@SpringBootApplication
@RestController
public class MywharfApplication {

	
	@RequestMapping("/")
	public String index(){
		return "Hello Spring Boot , mywharf !!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MywharfApplication.class, args);
	}
	
	//关闭显示
	/*public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MywharfApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
		
	}*/
}
