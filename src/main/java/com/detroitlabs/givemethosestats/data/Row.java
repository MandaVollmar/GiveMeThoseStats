package com.detroitlabs.givemethosestats.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Row { //Player search details from API
    private String playerId;
    private String position;
    private String nameFirst;
    private String nameLast;
    private String activeSw;
    private String proDebutDate;

    private String hr;
    private String season;
    private String slg;
    private String rbi;
    private String sb;
    private String obp;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getActiveSw() {
        return activeSw;
    }

    public void setActiveSw(String activeSw) {
        this.activeSw = activeSw;
    }

    public String getProDebutDate() {
        return proDebutDate;
    }

    public void setProDebutDate(String proDebutDate) {
        this.proDebutDate = proDebutDate;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSlg() {
        return slg;
    }

    public void setSlg(String slg) {
        this.slg = slg;
    }

    public String getRbi() {
        return rbi;
    }

    public void setRbi(String rbi) {
        this.rbi = rbi;
    }

    public String getSb() {
        return sb;
    }

    public void setSb(String sb) {
        this.sb = sb;
    }

    public String getObp() {
        return obp;
    }

    public void setObp(String obp) {
        this.obp = obp;
    }
}
