# weatherApp
 Android App using OpenWeatherMap 5 day weather forecast API

# simulator
Proper operation has been verified in the following device:
- Nexus 5X API 24

# How to run
The code must be downloaded from the repository hosted at the following link: https://github.com/DavidxD/weatherApp
For the proper functioning of the app, use the Nexus 5X API 24 device

# Libraries
useLibrary 'org.apache.http.legacy' //As a library for downloading OpenWeather api data

# API
OpenWeatherMap 5 day weather forecast API

# Development
A simple interface has been developed that adjusts to the 4 hours that was had to develop the project.
The asynchronous download of data is used to obtain the data of the api
The Observer pattern is used for classes interested in providing changes to the interface when the data is downloaded

# In the future
Proper development of an interface
Improvement of the file string.xml, with its consequent impact on the layouts
Test development
Extension of the functionality, these can be some examples:
- Give the user the possibility to change the location from which to obtain information
- Develop and design a weather map with the user's favorite cities
- Improve the side menu of the application
- Perform an Asynchronous download of the images provided by the api

