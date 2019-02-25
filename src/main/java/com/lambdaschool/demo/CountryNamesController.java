package com.lambdaschool.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")

public class CountryNamesController {

    @RequestMapping("/all")
    public ArrayList<Country> getAll() {
        CountrySearchFeb252019Application.ourCountryList.countryList.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        return CountrySearchFeb252019Application.ourCountryList.countryList;
    }

//    @RequestMapping("/begin")
//    public Country getEmployeeDetail(@RequestParam(value = "letter") String letter) {
//
//        ArrayList<Country> beginningLetter = new ArrayList<>();
//        CountrySearchFeb252019Application.ourCountryList.countryList
//
//        return
//    }



}
