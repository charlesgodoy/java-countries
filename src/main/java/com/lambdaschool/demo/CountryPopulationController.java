package com.lambdaschool.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")

public class CountryPopulationController {

    @RequestMapping("/size")
    public ArrayList<Country> getCountryPopulation(@RequestParam(value = "people") long people) {
        ArrayList<Country> getSize = new ArrayList<Country>();
        CountrySearchFeb252019Application.ourCountryList.countryList.forEach(country -> {
            if(country.getPopulation() > people) {
                getSize.add(country);
            }
        });

        return getSize;
    }

    @RequestMapping("/min")
    public ArrayList<Country> getCountryMinPopulation(@RequestParam(value = "min") long min) {
        ArrayList<Country> getMin = new ArrayList<Country>();
        CountrySearchFeb252019Application.ourCountryList.countryList.forEach(country -> {
            if(country.getPopulation() > 1){

            }
        });
        return getMin;
    }

}
