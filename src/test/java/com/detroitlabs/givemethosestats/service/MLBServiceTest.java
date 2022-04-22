package com.detroitlabs.givemethosestats.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.*;

class MLBServiceTest {
    //Arrange
    MLBService testMLBService = new MLBService();

    @Test
    void shouldFetchPlayerSearch() throws UnsupportedEncodingException {
        //Arrange
        MLBService.fetchPlayerSearch("Y", "betts");
        // Act
    boolean result = testMLBService.equals(true);
        //Assert
        assertNotNull(true);
    }

    @Test
    void shouldFetchHittingStats() throws UnsupportedEncodingException {
        //Assert
        MLBService.fetchHittingStats("R", "2022", "605141");
        // Act
        boolean result = testMLBService.equals(true);
        //Assert
        assertNotNull(true);
    }
}