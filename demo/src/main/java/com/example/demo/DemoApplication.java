package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.ViewCoins;

@SpringBootApplication
public class DemoApplication 
{

	@Autowired
	private ViewCoins testService;  // Test 클래스 자동 주입
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Override
    // public void run(String... args) throws Exception {
    //     // 애플리케이션 시작 시 fetchCoinData 메서드 실행
    //     testService.fetchCoinData();
    // }

}
