package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/v1/muyi")
public class ConsumingRestController {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    public ConsumingRestController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

    @GetMapping("/quote")
    public Object getQuote(){
        return restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Object.class);
//        HttpEntity<Object> httpEntity = new HttpEntity<>(null);
//        return restTemplate.exchange("https://gturnquist-quoters.cfapps.io/api/random",
//                HttpMethod.GET, httpEntity, Object.class);
    }
}
