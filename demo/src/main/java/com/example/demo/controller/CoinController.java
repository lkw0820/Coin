package com.example.demo.controller;
import lombok.extern.java.Log;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.domain.CoinDTO;
import com.example.demo.service.CoinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log

@RestController
@RequestMapping("/Test")
public class CoinController {

    @Autowired
	private CoinService coinService;  // CoinService 클래스 자동 주입


    @GetMapping("/coinList")
    public List<CoinDTO> coinGetAll(){
        
        return coinService.viewAllCoins();
    }
}
