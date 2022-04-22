package com.detroitlabs.givemethosestats.controller;

import com.detroitlabs.givemethosestats.data.ImageSearch;
import com.detroitlabs.givemethosestats.data.Row;
import com.detroitlabs.givemethosestats.data.StatsSearch;
import com.detroitlabs.givemethosestats.service.ImageService;
import com.detroitlabs.givemethosestats.service.MLBService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class SiteController {

    @RequestMapping("/")
    public String displayHome () {
        return "home";
    }


    @RequestMapping("/player-search")
    public String displayPlayerDetails(ModelMap modelMap) throws UnsupportedEncodingException {
        StatsSearch search = MLBService.fetchPlayerSearch("Y", "choi");
        ImageSearch cardImage = ImageService.fetchPlayerImage(search.getSearchPlayerAll().getQueryResults().getAllRows()
                .get(0).getNameFirst(), search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getNameLast(),
                search.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getTeamFull());
        List<Row> rows = search.getSearchPlayerAll().getQueryResults().getAllRows();
        String results =cardImage.getResults().get(0);
        modelMap.put("cardImage", results);
            modelMap.put("rows", rows);
        return "player-search";
    }

    @RequestMapping(value = "/player-search", method = RequestMethod.POST)
    public String updateFromSearch(@RequestParam("userEnteredName") String name_part, @RequestParam("userEnteredStatus") String active_sw,
                                   ModelMap modelMap) throws UnsupportedEncodingException {
        StatsSearch userSearch = MLBService.fetchPlayerSearch(active_sw, name_part);
        ImageSearch cardImage = ImageService.fetchPlayerImage(userSearch.getSearchPlayerAll().getQueryResults().getAllRows()
                .get(0).getNameFirst(), userSearch.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getNameLast(),
                userSearch.getSearchPlayerAll().getQueryResults().getAllRows().get(0).getTeamFull());
        modelMap.put("userSearch", userSearch);
        return "redirect: /player-search";
    }

    @RequestMapping("/current-hitting-stats")
    public String displayCurrentHittingStats (ModelMap modelMap) throws UnsupportedEncodingException {
        StatsSearch currentHitting = MLBService.fetchHittingStats("R","2022", ".getSearchPlayerAll().getQueryResults().getAllRows().get(0).getPlayerId()");
        List<Row> rows = currentHitting.getSportHittingTm().getQueryResults().getAllRows();
        modelMap.put("rows", rows);
        return "current-hitting-stats";
    }
}


