# Android-Covid-Tracker-App
It is a Covid Tracker App which helps you to track the covid cases All around the world . A collective data / Global data of covid is shown on the home page which includes a PIE chart which shows (Total cases, Recovered cases, Deaths , Active Cases and other deatails are also present below the chart such as (Today Cases ,Critical cases , Total Cases , Total Recovered Cases , Total Deaths , Today Deaths, Affected Countries) .
- Also added a list of ALL the affected covid countries with there Flag ! So user can search the information of any desired country which they want.
- Added pretty decent UI which makes this app more user friendly !!


## Tech Stack used :
- Java and Android Studio
- [Blackfizz](https://github.com/blackfizz/EazeGraph) libray for displaying the PIE chart.
- [Volley](https://developer.android.com/training/volley) library for fetching the JSON data from the URL.
- [disease.sh](https://corona.lmao.ninja/) for fetching the data . It is an Open Disease Data API .
- [Glide](https://github.com/bumptech/glide) for setting the image of the flag .
- [POSTMAN](https://www.postman.com/) for checking the data which was fecthing by the volley.
- [Simple Arc Loader](https://github.com/generic-leo/SimpleArcLoader) for showing the loading animation.


## Data coming for the Global data in JSON format checking via Postman
    {
      "updated": 1621705546566,
      "cases": 166841019,
      "todayCases": 375836,
      "deaths": 3464321,
      "todayDeaths": 6821,
      "recovered": 147794490,
      "todayRecovered": 530266,
      "active": 15582208,
      "critical": 97786,
      "casesPerOneMillion": 21404,
      "deathsPerOneMillion": 444.4,
      "tests": 2376534043,
      "testsPerOneMillion": 303660.24,
      "population": 7826293215,
      "oneCasePerPeople": 0,
      "oneDeathPerPeople": 0,
      "oneTestPerPeople": 0,
      "undefined": 0,
      "activePerOneMillion": 1991.01,
      "recoveredPerOneMillion": 18884.35,
      "criticalPerOneMillion": 12.49,
      "affectedCountries": 222
    }
    
## Data coming for the Specific Country in JSON checking via Postman 
     {
          "updated": 1621705546571,
          "country": "India",
          "countryInfo": {
              "_id": 356,
              "iso2": "IN",
              "iso3": "IND",
              "lat": 20,
              "long": 77,
              "flag": "https://disease.sh/assets/img/flags/in.png"
          },
          "cases": 26522164,
          "todayCases": 237095,
          "deaths": 299150,
          "todayDeaths": 3642,
          "recovered": 23404320,
          "todayRecovered": 345303,
          "active": 2818694,
          "critical": 8944,
          "casesPerOneMillion": 19053,
          "deathsPerOneMillion": 215,
          "tests": 326484155,
          "testsPerOneMillion": 234541,
          "population": 1392012604,
          "continent": "Asia",
          "oneCasePerPeople": 52,
          "oneDeathPerPeople": 4653,
          "oneTestPerPeople": 4,
          "undefined": 2025,
          "activePerOneMillion": 2024.91,
          "recoveredPerOneMillion": 16813.3,
          "criticalPerOneMillion": 6.43
      }
      
      
# Preview of App

- App icon 
  
![icon](https://user-images.githubusercontent.com/68746461/119236991-147a2f00-bb58-11eb-8207-e530b02749ca.jpeg)

- Loading Animation 

![loading](https://user-images.githubusercontent.com/68746461/119237008-3378c100-bb58-11eb-9b93-66f8f60b2272.jpeg)

- Home Page 

![home1](https://user-images.githubusercontent.com/68746461/119237042-6de25e00-bb58-11eb-954c-2113563d5f52.jpeg)
![home2](https://user-images.githubusercontent.com/68746461/119237051-79358980-bb58-11eb-867f-74a965c9df11.jpeg)

- Country Name List

![List](https://user-images.githubusercontent.com/68746461/119237069-a08c5680-bb58-11eb-9315-231ab4f4db86.jpeg)

- Searching For Country

![search](https://user-images.githubusercontent.com/68746461/119237104-cdd90480-bb58-11eb-9b0d-d5da37d23c65.jpeg)

- Data Of Searched Country

![otherc](https://user-images.githubusercontent.com/68746461/119237126-f5c86800-bb58-11eb-87ea-f6d3620ed8c7.jpeg)
