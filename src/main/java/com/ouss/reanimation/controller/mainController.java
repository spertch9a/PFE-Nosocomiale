package com.ouss.reanimation.controller;


import com.ouss.reanimation.DTO.CaseToRetainDTO;
import com.ouss.reanimation.model.Test1;
import com.ouss.reanimation.model.TraumaDescription;
import com.ouss.reanimation.model.TraumaSolution;
import com.ouss.reanimation.repository.MaladieInsertRepo;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.exception.ExecutionException;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class mainController {

    @GetMapping("/home")
    public String index() {
        return "Hello";
    }

    @GetMapping("/allCases")
    public void showAllCases() {
        System.out.println("All cases has ben executed");
        Test1 test1 = new Test1();
        try {
            test1.configure();
            test1.preCycle();
        } catch (jcolibri.exception.ExecutionException e) {
            e.printStackTrace();
        }
    }

    @PostMapping(value = "/getACase", consumes = "application/json", produces = "application/json")
    public TraumaDescription getAcase(@RequestBody TraumaDescription request) {
        TraumaDescription desc = new TraumaDescription();
        System.out.println(request.getAge());
        return request;
    }

    @PostMapping(value = "/sendTrauma/{k}", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public TraumaSolution getResponse(@RequestBody TraumaDescription requset, @PathVariable int k) throws ExecutionException {
        Test1 test1 = new Test1();
        //run the whole execution
        try {
            // Configure it
            test1.configure();
            // Run the precycle --> load the cases
            test1.preCycle();
            {
                CBRQuery myquery = test1.getQuery(requset);
                CBRQuery query = new CBRQuery();
                query.setDescription(requset);
                // Run a cycle with the query
                test1.cycle(myquery, k);
                System.out.println("Cycle finished.");
            }
            //while(!reader.readLine().equals("exit"));
            // Run the postcycle
            test1.postCycle();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
//        CBRQuery quryTa3ek=test1.getQuery(requset);
//        test1.cycle(quryTa3ek, 3);
//        return new TraumaSolution();
    }


    @RequestMapping(value = "/sendsTrauma/{k}", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
    public Collection<CBRCase> getaResponse(@RequestBody TraumaDescription requset, @PathVariable int k) throws ExecutionException {
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



    @RequestMapping(value = "/retainAcase", consumes = "application/json", method = RequestMethod.POST)
    public void retainACase(@RequestBody CaseToRetainDTO myrequest) throws ExecutionException {
        System.out.println("/retainAcase IS CALLED!");
        System.out.println("myrest is " + myrequest);

        TraumaDescription mydescription = (TraumaDescription) myrequest.getDescription();
        TraumaSolution mysolution = (TraumaSolution) myrequest.getSolution();

        //inserting directly to the database (using queries)
        MaladieInsertRepo myrepo = new MaladieInsertRepo();
        myrepo.caseInsert(myrequest);

        Test1 tss = new Test1();
        tss.configure();
        tss.preCycle();




//        System.out.println("verify");

//        System.out.println("description is " + mydescription.toString());
//        System.out.println("solution is " + mysolution.toString());
//        System.out.println(myrequest);
//        System.out.println("PRECYCLE");
//        // Configure it
//        Test1 test1 = new Test1();
//
//        // Run the precycle --> load the cases
//        Test1 myclass = new Test1();
//        System.out.println("before adaption");
//        //https://www.baeldung.com/java-jsonarray-get-value-by-key
//        //https://docs.spring.io/spring-boot/docs/2.3.0.M4/api//org/springframework/boot/configurationprocessor/json/JSONObject.html
//        myclass.caseAdaption(mydescription, mysolution);
//        System.out.println("Case succesfullly adapted");
    }


}