package com.demo.infection.model;

import com.demo.infection.jcolibri.cbrcore.CBRQuery;
import com.demo.infection.jcolibri.cbrcore.CaseComponent;
import com.demo.infection.jcolibri.exception.ExecutionException;
import com.demo.infection.jcolibri.util.FileIO;


import java.io.IOException;
import java.net.URL;

public class main {
    public static void main(String[] args) throws ExecutionException {
        System.out.println("This is the main function is package com.demo.second");
        System.out.println("######################");
      // URL file = FileIO.findFile("C:/demo-Serveur1-Devlop/demo-Serveur1-develop/demo/src/main/java/com/demo/infection/model/databaseconfig.xml");
      //  System.out.println("**"+ file);





            /********* Query Definition **********/

          CaseDescription queryDesc=new CaseDescription();
            // queryDesc.setAccommodation(TravelDescription.AccommodationTypes.ThreeStars);
        queryDesc.setId(101);
        queryDesc.setNip("1234");
        queryDesc.setJ("21/03/2022");
        queryDesc.setSa(1);
        queryDesc.setT(39.7);
        queryDesc.setHt(0);
        queryDesc.setAus(1);
        queryDesc.setDes(1);
        queryDesc.setKt(0);
        queryDesc.setAbl(0);
        queryDesc.setInfkt(1);
        queryDesc.setSec(1);
        queryDesc.setMsec(1);
        queryDesc.setTou(1);
        queryDesc.setDys(1);
        queryDesc.setSu(0);
        queryDesc.setPyu(0);
        queryDesc.setBrm(0);
        queryDesc.setDsp(1);
        queryDesc.setFr(0);
        queryDesc.setLu(0);
        queryDesc.setGb(23);
        queryDesc.setCrp(138);
        queryDesc.setPct(54);
        queryDesc.setRx(1);

        test1 test = new test1();
        test.configure();
        System.out.println("la configuration succée");
        test.preCycle();
        System.out.println("precycle marche");
        CBRQuery query = new CBRQuery();
        query.setDescription((CaseComponent) queryDesc);

        test.cycle(query,1);
System.out.println("cycle marche");


            //	System.out.println("Cycle finished. Type exit to idem");
            //}while(!reader.readLine().equals("exit"));








            //  try {
        // System.out.println("Running configure()");
        //test.configure();

        //System.out.println("Running preCycle()");
        //test.preCycle();
        //System.out.println(test.mycases);
        //System.out.println("Items of the case a");
        // for(CBRCase c: test.mycases.getCases())
        //    System.out.println(c);
        //The cycle will require a query description, so we'll make it before calling the cycle

        //System.out.println("Running the cycle");
        //} catch (ExecutionException e) {
        //  e.printStackTrace();
        //}

        // }
    }
}
