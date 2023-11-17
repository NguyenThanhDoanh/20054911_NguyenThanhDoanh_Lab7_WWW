package com.example.doanh;

import com.example.doanh.enums.ProductStatus;
import com.example.doanh.models.Product;
import com.example.doanh.repositories.ProductRepository;
import net.datafaker.Faker;
import net.datafaker.providers.base.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class Lab7Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Lab7Application.class);
	}
	@Autowired
	private ProductRepository productResponsitory;
//	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			Faker faker = new Faker();
			Random rnd = new Random();
			Device devices = faker.device();
			Product product = null;
			for (int i = 0; i < 200; i++) {
				product = new Product(devices.modelName(), faker.lorem().paragraph(30), "piece", devices.manufacturer(), ProductStatus.ACTIVE);
				productResponsitory.save(product);
			}

		};


	}
}
