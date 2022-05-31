package com.example.demo.demo.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class mainController {
    @GetMapping("home")
    public String index(){
        return "Hello";
    }

    //THis next function is to return a trauma description case structure (as JSON)
    @GetMapping(value = "/getADescription")
    public TraumaDescription getAcaseDescription() {
        TraumaDescription desc = new TraumaDescription();
        return desc;
    }
    //THis next function is to return a trauma Solutiopn case structure (as JSON)
    @GetMapping(value = "/getADescription")
    public TraumaSolution getAcaseSolution() {
        TraumaDescription sol = new TraumaDescription();
        return sol;
    }

    @GetMapping("/allCases")
    public void showAllCases() {
        //here we'll add a code just to import the casebase and print it to the console
        //We may return it to the client in JSON format jsut for example
    }

//SendsTrauma  code


    //caseAdaptionCode

}
