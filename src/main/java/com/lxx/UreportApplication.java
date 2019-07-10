package com.lxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * @ImportResource 加载配置文件
 */
@ImportResource("classpath:context.xml")
@SpringBootApplication
public class UreportApplication {

	public static void main(String[] args) {
		SpringApplication.run(UreportApplication.class, args);
	}
}
