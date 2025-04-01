package com.routefare;

import com.routefare.osm.OsmApiClient;
import com.routefare.tis.TisDataScraper;



public class Main {
    
        //reimplement main class:
    
        //function for user input
    
        //function for rate calculations based on user inputted details
    
        //function for final output

    public static void main(String[] args) {
        System.out.println("RouteFare Application Started...");

        // Initialize the OSM API Client and test import
        OsmApiClient.testImport();

        // Initialize and run the TIS scraper (not implemented yet)
        TisDataScraper tisScraper = new TisDataScraper();
        // tisScraper.fetchData();  // Placeholder for future implementation

        //call DatabaseConnector.java

        //call OpenSourceRoutingMachineClient.java

        System.out.println("Application Finished.");
    }
}
