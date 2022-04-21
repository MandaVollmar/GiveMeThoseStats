package com.detroitlabs.givemethosestats.service;

import com.detroitlabs.givemethosestats.data.SearchPlayerAll;
import com.detroitlabs.givemethosestats.data.StatsSearch;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Component
public class mlbService {

    public static StatsSearch fetchPlayerSearch (String active_sw, String name_part) throws UnsupportedEncodingException {
        RestTemplate restTemplate = new RestTemplate();
        String playerName= URLEncoder.encode(name_part, StandardCharsets.UTF_8.toString());
        String url ="http://lookup-service-prod.mlb.com/json/named.search_player_all.bam?sport_" +
                "code='mlb'&active_sw='"+ active_sw + "'&name_part='"+playerName+"%'";
        return restTemplate.getForObject(url, StatsSearch.class);
    }

    public static StatsSearch fetchHittingStats (String game_type, String season, String player_id) throws UnsupportedEncodingException {
        RestTemplate restTemplate = new RestTemplate();
        String gameType= URLEncoder.encode(game_type, StandardCharsets.UTF_8.toString());
        String playerId= URLEncoder.encode(player_id, StandardCharsets.UTF_8.toString());
        String url = "http://lookup-service-prod.mlb.com/json/named.sport_hitting_tm.bam?league_list_id='mlb'&game_type='"+
                gameType +"'&season='"+ season +"'&player_id='"+ playerId+"'";
        return restTemplate.getForObject(url, StatsSearch.class);
    }

}
