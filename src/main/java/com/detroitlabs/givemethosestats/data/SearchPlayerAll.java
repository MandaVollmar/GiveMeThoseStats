package com.detroitlabs.givemethosestats.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchPlayerAll { //Player search info from API
    private QueryResults queryResults;

    public QueryResults getQueryResults() {
        return queryResults;
    }

    public void setQueryResults(QueryResults queryResults) {
        this.queryResults = queryResults;
    }
}
