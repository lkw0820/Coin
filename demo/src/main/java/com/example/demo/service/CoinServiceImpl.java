package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.example.demo.domain.CoinDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class CoinServiceImpl implements CoinService{

    @Override
    public List<CoinDTO> viewAllCoins() {
        // TODO Auto-generated method stub
        OkHttpClient client = new OkHttpClient();
        return fetchCoinData(client);
    }

    private List<CoinDTO> fetchCoinData(OkHttpClient client) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode json = mapper.createObjectNode();
        try{
            Request request = new Request.Builder()
            .url("https://api.upbit.com/v1/market/all?is_details=true")
            .get()
            .addHeader("accept", "application/json")
            .build();
            //1.api 호출
            Response response = client.newCall(request).execute();
            //2. 정상여부
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            //3.응답데이터 읽기
            String jsonResponse = response.body().string();
            System.out.println(jsonResponse);
            //4.json객체 java객체로 변환
            List<CoinDTO> coins = mapper.readValue(jsonResponse, new TypeReference<List<CoinDTO>>() {});

            // for (CoinDTO coinDTO : coins) {
            //     System.out.println(coinDTO);
                
            // }
            return coins;
        }
        catch(IOException e) {
            e.printStackTrace();
            return null;
        }
    }
        



}
