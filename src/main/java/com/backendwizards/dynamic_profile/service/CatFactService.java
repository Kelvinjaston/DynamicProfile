package com.backendwizards.dynamic_profile.service;

import com.backendwizards.dynamic_profile.model.CatFact;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
@Service
public class CatFactService {
    @Value("${cat.fact.url}")
    private String catFactUrl;

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String Fallback_Fact = "Could not fetch cat fact. A cat's nose pad is ridged with a unique pattern, like a human's fingerprint. ";

    public String getRandomCatFact(){
        try {
            CatFact catFact = restTemplate.getForObject(catFactUrl, CatFact.class);
            if (catFact !=null && catFact.getFact() !=null && !catFact.getFact().isEmpty()){
                return  catFact.getFact();
            }else {
                return Fallback_Fact;
            }
        }catch (RestClientException e){
            System.err.println("Error fetching cat fact from external API: " + e.getMessage());
            return Fallback_Fact;
        }
    }
}
