package com.example.demo.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service  // Spring에서 관리할 수 있는 서비스 빈으로 등록
public class ViewCoins {
    OkHttpClient client = new OkHttpClient();

    public void fetchCoinData(){
        try{
            Request request = new Request.Builder()
            .url("https://api.upbit.com/v1/market/all?is_details=false")
            .get()
            .addHeader("accept", "application/json")
            .build();
          
          Response response = client.newCall(request).execute();
          System.out.println(response);
          System.out.println(response.body().string());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
