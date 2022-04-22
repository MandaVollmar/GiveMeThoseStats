package com.detroitlabs.givemethosestats.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatsSearch {
    private SearchPlayerAll searchPlayerAll;
    private SportHittingTm sportHittingTm;

    public SearchPlayerAll getSearchPlayerAll() {
        return searchPlayerAll;
    }

    public void setSearchPlayerAll(SearchPlayerAll searchPlayerAll) {
        this.searchPlayerAll = searchPlayerAll;
    }

    public SportHittingTm getSportHittingTm() {
        return sportHittingTm;
    }

    public void setSportHittingTm(SportHittingTm sportHittingTm) {
        this.sportHittingTm = sportHittingTm;
    }

}
