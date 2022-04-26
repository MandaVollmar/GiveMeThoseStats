package com.detroitlabs.givemethosestats.data;

import com.detroitlabs.givemethosestats.service.MLBService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageSearch extends StatsSearch{
    private List<String> results;

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

}
