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
    private SportCareerHitting sportCareerHitting;
    private SportPitchingTm sportPitchingTm;
    private ImageSearch imageSearch;

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

    public SportCareerHitting getSportCareerHitting() {
        return sportCareerHitting;
    }

    public void setSportCareerHitting(SportCareerHitting sportCareerHitting) {
        this.sportCareerHitting = sportCareerHitting;
    }

    public SportPitchingTm getSportPitchingTm() {
        return sportPitchingTm;
    }

    public void setSportPitchingTm(SportPitchingTm sportPitchingTm) {
        this.sportPitchingTm = sportPitchingTm;
    }

    public ImageSearch getImageSearch() {
        return imageSearch;
    }

    public void setImageSearch(ImageSearch imageSearch) {
        this.imageSearch = imageSearch;
    }

    public String getImageMatch (){
        for(int index =0; index <= getSearchPlayerAll().getQueryResults().getAllRows().size(); index++)

        if (imageSearch.getResults().get(0).contains(searchPlayerAll.getQueryResults().getAllRows().get(index).getTeamFull())) {
            String match = imageSearch.getResults().get(index);
            return match;

        }
        return null;
    }

}
