package com.mall.mes2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = {"com.mall.mes2.mapper"})
public class Mes2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mes2Application.class, args);
	}

}
