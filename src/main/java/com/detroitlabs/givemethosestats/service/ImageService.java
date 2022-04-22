package com.detroitlabs.givemethosestats.service;

import com.detroitlabs.givemethosestats.data.ImageSearch;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ImageService {
    public static ImageSearch fetchPlayerImage (String firstName, String lastName, String team){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://imsea.herokuapp.com/api/1?q="+ firstName+"_"+
                lastName+"_"+ team, ImageSearch.class);
    }
}
