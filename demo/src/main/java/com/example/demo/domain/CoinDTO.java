package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class CoinDTO {
    private String market;
    private String korean_name;
    private String english_name;
    private MarketEvent market_event;

}
