# RouteFare

Toll Tax Calculator using OSMapi and live NHAI data

Utilises OSM API 0.6 using westnordost's [Java client](https://github.com/westnordost/osmapi)

Vanilla Java reimplementation of geohacker's TIS NHAI [scraper](https://github.com/geohacker/toll-plazas-india)

This project can be compiled with the build-with-jar task called using Ctrl+Shift+B on VSCode. This uses the .vscode/tasks.json config

It can be run using the standard Run button.

## Project structure & class diagram:

```
com/
└── routefare/
    ├── Main.java
    │   └── class Main
    │         ├── main(String[] args)
    │         ├── userInput()                // To capture user input
    │         ├── calculateRates()           // To calculate rates based on input details
    │         └── displayOutput()            // To produce final output
    │
    ├── osm/
    │   ├── OsmApiClient.java
    │   │   └── class OsmApiClient
    │   │         ├── testImport()           // Already implemented: tests OSM API library import
    │   │         └── convertUserInputToLatLong()  // To convert user input into latitude/longitude
    │   │
    │   └── OpenSourceRoutingMachineClient.java
    │         └── class OpenSourceRoutingMachineClient
    │               ├── fetchRoute()         // To fetch routes from OSRM
    │               ├── convertJsonToSpatialTree()  // To convert JSON into spatial trees (R-tree, KD-tree, etc.)
    │               └── calculateTollDistance()     // To compute toll distance (near route/haversine)
    │
    ├── sql/
    │   └── DatabaseConnector.java
    │         └── class DatabaseConnector
    │               ├── fetchCsvData()       // To load CSV data from disk
    │               ├── splitCsvData()       // To split data into name, latitude, longitude, rates, etc.
    │               ├── convertToSQLTables() // To convert data into multiple SQL tables
    │               ├── readTollFeaturesTable1()  // To read toll features from table 1
    │               ├── readTollFeaturesTable2()  // To read toll features from table 2
    │               └── readTollFeaturesTable3()  // To read toll features from table 3 (and more as needed)
    │
    └── tis/
          └── TisDataScraper.java
                └── class TisDataScraper
                      └── fetchData()        // To scrape toll plaza data and save CSV in data/ folder
```