package com.detroitlabs.givemethosestats.controller;

import com.detroitlabs.givemethosestats.data.Row;
import com.detroitlabs.givemethosestats.data.StatsSearch;
import com.detroitlabs.givemethosestats.data.queryResults;
import com.detroitlabs.givemethosestats.service.mlbService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class SiteController {

    queryResults queryResults = new queryResults();

    @RequestMapping("/player-search")
    public String displayPlayerDetails(ModelMap modelMap) throws UnsupportedEncodingException {
        StatsSearch search = mlbService.fetchPlayerSearch("Y", "smith");
        List<Row> rows = search.getSearchPlayerAll().getQueryResults().getAllRows();
            modelMap.put("rows", rows);
        return "player-search";
    }

    @RequestMapping(value = "/player-search", method = RequestMethod.POST)
    public String updateFromSearch(@RequestParam String name_part, ModelMap modelMap) throws UnsupportedEncodingException {
        StatsSearch search = mlbService.fetchPlayerSearch("Y", "smith");
        modelMap.getAttribute(name_part);
        return "redirect: /player-search";
    }

    @RequestMapping("/current-hitting-stats")
    public String displayCurrentHittingStats (ModelMap modelMap) throws UnsupportedEncodingException {
        StatsSearch currentHitting = mlbService.fetchHittingStats("R","2022", "605141");
        List<Row> rows = currentHitting.getSportHittingTm().getQueryResults().getAllRows();
        modelMap.put("rows", rows);
        return "current-hitting-stats";
    }

//    @RequestMapping("/output")
//    public String displayInfo (@RequestParam String name, ModelMap modelMap){
//        System.out.println(name);
//        return "home";
//    }
}


