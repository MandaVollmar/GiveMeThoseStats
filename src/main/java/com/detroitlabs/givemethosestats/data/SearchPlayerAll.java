package com.detroitlabs.givemethosestats.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchPlayerAll { //Player search info from API
    private queryResults queryResults;

    public queryResults getQueryResults() {
        return queryResults;
    }

    public void setQueryResults(queryResults queryResults) {
        this.queryResults = queryResults;
    }
}
