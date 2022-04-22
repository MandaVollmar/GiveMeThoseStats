package com.detroitlabs.givemethosestats.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageSearch {
    private List<String> results;

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }

    public String imageResultMatch (){// method to find matching image to player found.

        return null;
    }
}
