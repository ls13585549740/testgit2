package com.funong.newerp.common.tools;

import com.funong.newerp.dal.Base.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class HttpClient {

    @Autowired
    private RestTemplate restTemplate;

    public String get(String url) {
        return restTemplate.getForObject(url, String.class);
    }

    public String exchange(String url, HttpEntity formEntity) {
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST,
                formEntity, String.class);
        return response.getBody();
    }

    public String post(String url, Map params) {
        String response = restTemplate.postForObject(url, String.class, String.class, params);
        return response;
    }

    public ResponseDTO postForEntity(String url, HashMap params) {
        ResponseEntity<ResponseDTO> response = restTemplate.postForEntity(url, ResponseDTO.class, String.class, params);
        return response.getBody();
    }

}
