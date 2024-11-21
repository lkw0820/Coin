package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class Caution {
    @JsonProperty("PRICE_FLUCTUATIONS")
    private boolean priceFluctuations;
    
    @JsonProperty("TRADING_VOLUME_SOARING")
    private boolean tradingVolumeSoaring;
    
    @JsonProperty("DEPOSIT_AMOUNT_SOARING")
    private boolean depositAmountSoaring;
    
    @JsonProperty("GLOBAL_PRICE_DIFFERENCES")
    private boolean globalPriceDifferences;
    
    @JsonProperty("CONCENTRATION_OF_SMALL_ACCOUNTS")
    private boolean concentrationOfSmallAccounts;
}
