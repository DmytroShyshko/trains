This project allows you get information about train shadule in Ukraine from site http://uz.gov.ua.
It is a parser which parses html pages and store information (stations and routes) into database.
Classes for parser are in project 'updater'. Also there is bat file in the 'updater_utilit' folder.
It runs jar file, which conteins compiled project and all nesesery libraries.
To easy access data i created another project cold 'RoadService'. It is a RestFull service. Class Search perform 
all requests.
