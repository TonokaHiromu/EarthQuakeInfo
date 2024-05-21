package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuakeDataRest {

    private final String API_URL = "https://api.p2pquake.net/v2/history?codes=551&limit=10";

    public String getQuakeData() {
        // RestTemplateを作成
        RestTemplate restTemplate = new RestTemplate();
        // APIにGETリクエストを送信し、レスポンスをStringとして取得
        String quakeData = restTemplate.getForObject(API_URL, String.class);
        // 表示
        System.out.println(quakeData);
        // 取得したデータを返す
        return quakeData;
    }
}