package com.routefare;

import com.routefare.osm.OsmApiClient;
import com.routefare.tis.TisDataScraper;

public class Main {
    public static void main(String[] args) {
        System.out.println("RouteFare Application Started...");

        // Initialize the OSM API Client and test import
        OsmApiClient.testImport();

        // Initialize and run the TIS scraper (not implemented yet)
        TisDataScraper tisScraper = new TisDataScraper();
        // tisScraper.fetchData();  // Placeholder for future implementation

        System.out.println("Application Finished.");
    }
}
