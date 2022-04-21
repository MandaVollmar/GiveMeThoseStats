package com.detroitlabs.givemethosestats.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SportHittingTm { //API for current player hitting stats
    private queryResults queryResults;

    public queryResults getQueryResults() {
        return queryResults;
    }

    public void setQueryResults(queryResults queryResults) {
        this.queryResults = queryResults;
    }
}
