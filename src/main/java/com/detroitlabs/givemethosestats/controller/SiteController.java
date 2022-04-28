package com.detroitlabs.givemethosestats.controller;

import com.detroitlabs.givemethosestats.data.ImageSearch;
import com.detroitlabs.givemethosestats.data.Row;
import com.detroitlabs.givemethosestats.data.StatsSearch;
import com.detroitlabs.givemethosestats.service.ImageService;
import com.detroitlabs.givemethosestats.service.MLBService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class SiteController {

    @RequestMapping("/")
    public String displayHome(ModelMap modelMap) {
        return "home";
    }

    @RequestMapping("/videos")
    public String displayVideos(ModelMap modelMap) {
        return "videos";
    }


    @RequestMapping("/player-search")
    public String updateFromSearch(@RequestParam("name_part") String name_part, @RequestParam("active_sw") String active_sw,
                                   ModelMap modelMap) throws UnsupportedEncodingException {
        StatsSearch userSearch = MLBService.fetchPlayerSearch(active_sw, name_part);
//        ImageSearch cardImage = ImageService.fetchPlayerImage(userSearch.getSearchPlayerAll().getQueryResults().getAllRows()
//                .get(0).getNameFirst(), userSearch.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getNameLast(),
//                userSearch.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getTeamFull());
        List<Row> rows = userSearch.getSearchPlayerAll().getQueryResults().getAllRows();
//        String results = cardImage.getResults().get(0);
        modelMap.addAttribute("userSearch", userSearch);
//        modelMap.put("cardImage", results);
        modelMap.put("rows", rows);
        return new String("/player-search");
    }

    @RequestMapping("/current-hitting-stats")
    public String displayCurrentHittingStats(ModelMap modelMap)
            throws UnsupportedEncodingException {
        StatsSearch currentHitting = MLBService.fetchHittingStats("R", "2022", "660271");
        StatsSearch search = MLBService.fetchPlayerSearch("Y", "ohtani");
        List<Row> rows = currentHitting.getSportHittingTm().getQueryResults().getRow();
        String firstNameInfo = search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getNameFirst();
        String lastNameInfo = search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getNameLast();
        String player_id = search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getPlayerId();
        modelMap.put("firstName", firstNameInfo);
        modelMap.put("lastName", lastNameInfo);
        modelMap.put("rows", rows);
        return new String("/current-hitting-stats");
    }

    @RequestMapping("/career-hitting-stats")
    public String displayCareerHittingStats(ModelMap modelMap) throws UnsupportedEncodingException {
        StatsSearch careerHitting = MLBService.fetchCareerHittingStats("R", "660271");
        StatsSearch search = MLBService.fetchPlayerSearch("Y", "ohtani");
        List<Row> rows = careerHitting.getSportCareerHitting().getQueryResults().getRow();
        String firstNameInfo = search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getNameFirst();
        String lastNameInfo = search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getNameLast();
        String playerId = search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getPlayerId();
        modelMap.put("firstName", firstNameInfo);
        modelMap.put("lastName", lastNameInfo);
        modelMap.put("rows", rows);
        return "career-hitting-stats";
    }

    @RequestMapping("/current-pitching-stats")
    public String displayCurrentPitchingStats(ModelMap modelMap)
            throws UnsupportedEncodingException {
        StatsSearch currentHitting = MLBService.fetchPitchingStats("R", "2022", "608566");
        StatsSearch search = MLBService.fetchPlayerSearch("Y", "german");
        List<Row> rows = currentHitting.getSportPitchingTm().getQueryResults().getAllRows();
        String firstNameInfo = search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getNameFirst();
        String lastNameInfo = search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getNameLast();
        String player_id = search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getPlayerId();
        modelMap.put("firstName", firstNameInfo);
        modelMap.put("lastName", lastNameInfo);
        modelMap.put("rows", rows);
        return new String("/current-pitching-stats");
    }
}


