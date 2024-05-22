package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EarthquakeDataService {

    private final RestTemplate restTemplate;
    private final String API_URL = "https://api.p2pquake.net/v2/history?codes=551&limit=11";
    @Autowired
    public EarthquakeDataService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public EarthquakeData fetchSingleDataFromAPI() {
        // APIからJSONデータを取得し、EarthquakeDataの配列としてマッピングする
        ResponseEntity<EarthquakeData[]> response = restTemplate.getForEntity(API_URL, EarthquakeData[].class);
        EarthquakeData[] earthquakes = response.getBody();

        // 取得したデータを処理する
        //for (EarthquakeData earthquake : earthquakes) {
        	EarthquakeInfoData earthquakeInfoData = earthquakes[0].getEarthquake();
        	HypocenterInfoData hypocenterInfoData = earthquakeInfoData.getHypocenter();
            // 他の情報も表示する
        //}
        return earthquakes[0];
    }
    
    public EarthquakeData[] fetchMultiDataFromAPI() {
        // APIからJSONデータを取得し、EarthquakeDataの配列としてマッピングする
        ResponseEntity<EarthquakeData[]> response = restTemplate.getForEntity(API_URL, EarthquakeData[].class);
        EarthquakeData[] earthquakes = response.getBody();

        // 取得したデータを処理する
        //for (EarthquakeData earthquake : earthquakes) {
        	EarthquakeInfoData earthquakeInfoData = earthquakes[0].getEarthquake();
        	HypocenterInfoData hypocenterInfoData = earthquakeInfoData.getHypocenter();
            // 他の情報も表示する
        //}
        return earthquakes;
    }
}
