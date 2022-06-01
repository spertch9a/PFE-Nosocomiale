package com.example.demo.demo.controller;

import com.example.demo.demo.model.Test1;
import com.example.demo.demo.model.caseDescription;
import com.example.demo.demo.model.caseSolution;
import es.ucm.fdi.gaia.jcolibri.cbrcore.CBRCase;
import es.ucm.fdi.gaia.jcolibri.cbrcore.CBRQuery;
import es.ucm.fdi.gaia.jcolibri.exception.ExecutionException;
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
    public caseDescription getAcaseDescription() {
        caseDescription desc = new caseDescription();
        return desc;
    }
    //THis next function is to return a trauma Solutiopn case structure (as JSON)
    @GetMapping(value = "/getASolution")
    public caseSolution getAcaseSolution() {
        caseSolution sol = new caseSolution();
        return sol;
    }
    @GetMapping(value = "/getACase")
    public CBRCase getAcase() {
        CBRCase mycase = new CBRCase();
        mycase.setDescription(new caseDescription());
        mycase.setSolution(new caseSolution());
        return mycase;
    }

    @GetMapping("/allCases")
    public void showAllCases() {
        //here we'll add a code just to import the casebase and print it to the console
        //We may return it to the client in JSON format jsut for example
        System.out.println("All cases has ben executed");
        Test1 test1 = new Test1() {
            @Override
            public void cycle(CBRQuery cbrQuery) throws ExecutionException {

            }
        };
        try {
            test1.configure();
            test1.preCycle();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

//SendsTrauma  code


    //caseAdaptionCode

}
