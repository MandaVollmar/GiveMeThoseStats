package com.detroitlabs.givemethosestats.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerDetails {
    private String player_id;
    private String primary_position_txt;
    private String name_first;
    private String name_last;
    private String name_use;
    private String active_sw;
    private String pro_debut_date;
    private String team_name;
    private String age;
}
