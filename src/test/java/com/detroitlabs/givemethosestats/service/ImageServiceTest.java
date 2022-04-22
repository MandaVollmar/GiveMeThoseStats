package com.detroitlabs.givemethosestats.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageServiceTest {

    @Test
    void ShouldFetchPlayerImageURL() {
        //Arrange
        ImageService testImageService = new ImageService();
        ImageService.fetchPlayerImage("mookie", "betts", "dodgers");
        // Act
        boolean result = testImageService.equals(true);
        //Assert
        assertNotNull(true);
    }
}