package com.lambdaschool.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountrySearchFeb252019Application {

    static CountryList ourCountryList;

    public static void main(String[] args) {
        ourCountryList = new CountryList();
        SpringApplication.run(CountrySearchFeb252019Application.class, args);
    }

}
