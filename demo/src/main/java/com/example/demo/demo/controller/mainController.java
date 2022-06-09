package com.example.demo.demo.controller;

import com.example.demo.demo.model.Test1;
import com.example.demo.demo.model.caseDescription;
import com.example.demo.demo.model.caseSolution;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.CaseComponent;
import jcolibri.exception.ExecutionException;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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
        mycase.setDescription((CaseComponent) new caseDescription());
        mycase.setSolution((CaseComponent) new caseSolution());
        return mycase;
    }

    @GetMapping("/allCases")
    public void showAllCases() {
        //here we'll add a code just to import the casebase and print it to the console
        //We may return it to the client in JSON format jsut for example
        System.out.println("All cases has ben executed");
        Test1 test1 = new Test1() {

        };
        try {
            test1.configure();
            test1.preCycle();
        } catch (jcolibri.exception.ExecutionException e) {
            e.printStackTrace();
        }
    }

//SendsTrauma  code
@RequestMapping(value = "/sendsTrauma/{k}", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
public Collection<CBRCase> getaResponse(@RequestBody caseDescription requset, @PathVariable int k) throws ExecutionException {
    System.out.println("/SendsTrauma IS CALLED");
    Test1 test1 = new Test1();
    try {

        // Configure it
        test1.configure();
        // Run the precycle --> load the cases
        test1.preCycle();

        System.out.println("The received request is: " + requset);

        CBRQuery query = new CBRQuery();
        query.setDescription(requset);

        // Run a cycle with the query
        test1.cycle(query, k);

        System.out.println("Cycle finished.");

        // Run the postcycle
        test1.postCycle();

    } catch (Exception e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
    return test1.casestoreturn;
}

    //caseAdaptionCode

}
