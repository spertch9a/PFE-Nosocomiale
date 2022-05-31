package com.ouss.reanimation.model;

//https://gaia.fdi.ucm.es/research/colibri/jcolibri/doc/apidocs/src-html/es/ucm/fdi/gaia/jcolibri/test/test1/Test1.html


import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.*;
import jcolibri.connector.DataBaseConnector;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retain.StoreCasesMethod;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.GlobalSimilarityFunction;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.similaritry.Euclidienne;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.selection.SelectCases;
import jcolibri.method.revise.DefineNewIdsMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


public class Test1 implements StandardCBRApplication {

    public Collection<CBRCase> casestoreturn = null;
    Connector _connector;
    CBRCaseBase _caseBase;
    ArrayList<RetrievalResult> cases;

    public void configure() throws ExecutionException {
        try {
            // Create a data base connector
            _connector = (Connector) new DataBaseConnector();

            // Init the ddbb connector with the config file
            _connector.initFromXMLfile(jcolibri.util.FileIO.findFile("src/main/java/com/ouss/reanimation/model/databaseconfig.xml"));


            // Create a Lineal case base for in-memory organization
            _caseBase = (CBRCaseBase) new LinealCaseBase();

        } catch (Exception e) {
            throw new ExecutionException(e);
        }
    }

    Collection<CBRCase> mycases;

    public CBRCaseBase preCycle() throws ExecutionException {
        // Load cases from connector into the case base
        _caseBase.init(_connector);
        // Print the cases
        Collection<CBRCase> cases = _caseBase.getCases();
        for (CBRCase c : cases)
            System.out.println(c);
        mycases = cases;
        return (CBRCaseBase) _caseBase;
    }


    @Override
    public void cycle(CBRQuery cbrQuery, int k) throws ExecutionException {
        // Obtain configuration for KNN

        //similarityDialog.setVisible(true);
        NNConfig config = new NNConfig();
        jcolibri.cbrcore.Attribute attribute;
        //SimilConfigPanel similConfig;
        jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction function;

        //similConfig = nom;
        attribute = new Attribute("Temperature", TraumaDescription.class);
        config.addMapping(attribute, new Euclidienne());
        //config.setWeight(attribute,0.1);

        attribute = new Attribute("Age", TraumaDescription.class);
        config.addMapping(attribute, new Euclidienne());
        //	config.setWeight(attribute,0.1);

        attribute = new Attribute("Poids", TraumaDescription.class);
        config.addMapping(attribute, new Euclidienne());
        //	config.setWeight(attribute,0.1);
        attribute = new Attribute("glasgow", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);


        attribute = new Attribute("tonus", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //config.setWeight(attribute,0.1);

        attribute = new Attribute("conscient", TraumaDescription.class);
        config.addMapping(attribute, new Equal());


        attribute = new Attribute("convulsion", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //	config.setWeight(attribute,0.1);

        attribute = new Attribute("vomissement", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //	config.setWeight(attribute,0.1);
        attribute = new Attribute("motrice", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //	config.setWeight(attribute,0.1);*/
        attribute = new Attribute("mouvement", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //	config.setWeight(attribute,0.1);
        attribute = new Attribute("reflexe", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //	config.setWeight(attribute,0.1);


        attribute = new Attribute("fracture", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //config.setWeight(attribute,0.1);*/

        attribute = new Attribute("Pas", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //	config.setWeight(attribute,0.1);
        attribute = new Attribute("tempextr", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);


        attribute = new Attribute("pad", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //	config.setWeight(attribute,0.1);*/

        attribute = new Attribute("trc", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //	config.setWeight(attribute,0.1);

        attribute = new Attribute("marbure", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);

        attribute = new Attribute("cyanose", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);

        attribute = new Attribute("rales", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //config.setWeight(attribute,0.1);*/

        attribute = new Attribute("diurese", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //	config.setWeight(attribute,0.1);*/

        attribute = new Attribute("spo2", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);

        attribute = new Attribute("hemoragie", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);

        attribute = new Attribute("sexe", TraumaDescription.class);
        config.addMapping(attribute, new Equal());


        attribute = new Attribute("EncBranchique", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        //config.setWeight(attribute,0.1);

        attribute = new Attribute("Oedeme", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);

        attribute = new Attribute("corpsE", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);


        attribute = new Attribute("Fc", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);

        attribute = new Attribute("fr", TraumaDescription.class);
        config.addMapping(attribute, new Equal());
        config.setWeight(attribute, 0.1);


        config.setDescriptionSimFunction((GlobalSimilarityFunction) new Average());

        // Execute NN
        Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), cbrQuery, config);

        // Select k cases
        Collection<CBRCase> selectedcases = SelectCases.selectTopK(eval, k);
        casestoreturn = selectedcases;
//printing
//        System.out.println("PRINTING");
//        System.out.println(" ######################### ");
//        Collection<RetrievalResult> houma = SelectCases.selectTopKRR(eval, 10);
//        // Print the retrieval
//        System.out.println("Retrieved cases:");
//        for (RetrievalResult nse : houma)
//            System.out.println(nse);

        System.out.println("Combined + " + k + " cases");
        for (jcolibri.cbrcore.CBRCase c : selectedcases)
            System.out.println(c);

        showCases(eval, selectedcases);

    }


    public void postCycle() throws ExecutionException {
        this._caseBase.close();
    }


    //This function is to adapt new casess to the database

    public void caseAdaption(TraumaDescription mytraumadescription, TraumaSolution mytraumasolution) throws ExecutionException {
        try {
            configure();
            preCycle();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        CBRCase mycasetolearn = new CBRCase();
        System.out.println("my traumadescription " + mytraumadescription);
        System.out.println("my traumasolution " + mytraumasolution);
        mycasetolearn.setDescription(mytraumadescription);
        mycasetolearn.setSolution(mytraumasolution);

        //I'll teach the casebase with the new case

        System.out.println("my casebase: " + mycases);
        System.out.println("casebase " + _caseBase);
        //test6
        ArrayList<CBRCase> casestoLearnt = new ArrayList<CBRCase>();
        casestoLearnt.add(mycasetolearn);

        HashMap<Attribute, Object> componentsKeys = new HashMap<Attribute, Object>();
        componentsKeys.put(new Attribute("Id", TraumaDescription.class), "theid");
        componentsKeys.put(new Attribute("Id", TraumaSolution.class), "theid");
        //componentsKeys.put(new Attribute("id",Region.class), 7);
        DefineNewIdsMethod.defineNewIdsMethod(mycasetolearn, componentsKeys);

        System.out.println("Case with new Id");
        System.out.println(mycasetolearn);
        //  _caseBase.learnCases(casestoLearnt);
        StoreCasesMethod.storeCase(_caseBase, mycasetolearn);
        System.out.println("learnt ! ");

        //THESE WOULD HAVE BEEN USED IF WE DIDN'T SUFFER WITH THE DATABASE :'(
        // jcolibri.method.retain.StoreCasesMethod.storeCases((CBRCaseBase) mycases,collectiontolearn );
        //_caseBase.learnCases(collectiontolearn);


    }


    //ADDITIONAL FUNCTIONS...


    public CBRQuery getQuery(TraumaDescription request) {
        CBRQuery query = new CBRQuery();
        query.setDescription(request);

        return query;
    }

    public void showCases(Collection<RetrievalResult> eval, Collection<CBRCase> selected) {
        cases = new ArrayList<RetrievalResult>();
        for (RetrievalResult rr : eval) {
            if (selected.contains(rr.get_case())) {
                cases.add(rr);
            }
        }
        System.out.println("casessss");
        System.out.println(cases);
        System.out.println("I'm gonna print my cases from each one i get the description and the solution");
        for (int i = 0; i < cases.size(); i++) {
            RetrievalResult rr_case = cases.get(i);
            CBRCase mycase = rr_case.get_case();
            //for each case i get the description
            TraumaDescription desc = (TraumaDescription) mycase.getDescription();
            System.out.println("Case description");
            System.out.println(desc);
            //i get the solution
            TraumaSolution sol = (TraumaSolution) mycase.getSolution();
            System.out.println("Case solution");
            System.out.println(sol);
        }
    }


}
