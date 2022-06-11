package com.example.demo.demo.model;

//https://gaia.fdi.ucm.es/research/colibri/jcolibri/doc/apidocs/src-html/es/ucm/fdi/gaia/jcolibri/test/test1/Test1.html



import com.example.demo.demo.repository.MaladieInsertRepo;
import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.*;
import jcolibri.connector.DataBaseConnector;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retain.StoreCasesMethod;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.GlobalSimilarityFunction;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.similaritry.Euclidienne;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.selection.SelectCases;
import jcolibri.method.revise.DefineNewIdsMethod;
import jcolibri.util.FileIO;

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
            _connector.initFromXMLfile(FileIO.findFile("C:\\Users\\Oussama\\Documents\\GitHub\\PFE-Nosocomiale\\demo\\src\\main\\java\\com\\example\\demo\\demo\\model\\databaseconfig.xml"));


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


    public void cycle(CBRQuery cbrQuery, int k) throws ExecutionException {
        // Obtain configuration for KNN

        //similarityDialog.setVisible(true);
        NNConfig config = new NNConfig();
        Attribute attribute;
        //SimilConfigPanel similConfig;
        LocalSimilarityFunction function;

        attribute = new Attribute("sa", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        attribute = new Attribute("t", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local

        attribute = new Attribute("ht", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local


        attribute = new Attribute("aus", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());

        config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT14");
        attribute = new Attribute("des", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local

        //config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT9");
        attribute = new Attribute("kt", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local

        config.setWeight(attribute, 0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT22");
        attribute = new Attribute("abl", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local

        config.setWeight(attribute, 0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT23");
        attribute = new Attribute("infkt", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local

        config. setWeight(attribute,0.1);
        attribute = new Attribute("sec", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local

        config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT10");
        attribute = new Attribute("msec", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local

        //config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT11");
        attribute = new Attribute("tou", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT12");
        attribute = new Attribute("dys", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT13");
        //JOptionPane.showConfirmDialog(null, "DEBUT15");
        attribute = new Attribute("su", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT16");
        attribute = new Attribute("pyu", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT17");
        attribute = new Attribute("brm", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT18");
        attribute = new Attribute("dsp", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT19");
        attribute = new Attribute("lu", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT20");
        attribute = new Attribute("fr", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        //config.setWeight(attribute,0.1);
        //JOptionPane.showConfirmDialog(null, "DEBUT21");
        attribute = new Attribute("gb", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        //config.setWeight(attribute, 0.1);
        //JOptionPane.showConfirmDialog(null, "FIN5");
        //JOptionPane.showConfirmDialog(null, "DEBUT6");
        attribute = new Attribute("crp", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        //JOptionPane.showConfirmDialog(null, "FIN6");
        //config.setWeight(attribute,0.1);
        //config.setWeight(attribute, similConfig.getWeight());
        //JOptionPane.showConfirmDialog(null, "DEBUT7");
        attribute = new Attribute("pct", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        config.setWeight(attribute, 1.0);
        //JOptionPane.showConfirmDialog(null, "DEBUT8");
        attribute = new Attribute("rx", caseDescription.class);
        config.addMapping(attribute, (LocalSimilarityFunction) new Euclidienne());        //fonction de similarite local
        config.setWeight(attribute, 0.1);


        config.setDescriptionSimFunction((GlobalSimilarityFunction) new Average());

        // Execute NN
        Collection<RetrievalResult> eval = NNScoringMethod. evaluateSimilarity(_caseBase.getCases(), cbrQuery, config);

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
        for (CBRCase c : selectedcases)
            System.out.println(c);

        showCases(eval, selectedcases);

    }


    public void postCycle() throws ExecutionException {
        this._caseBase.close();
    }


    //This function is to adapt new casess to the database

    public void caseAdaption(caseDescription mytraumadescription, caseSolution mytraumasolution) throws ExecutionException {
        try {
            configure();
            preCycle();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        CBRCase mycasetolearn = new CBRCase();
        System.out.println("my traumadescription " + mytraumadescription);
        System.out.println("my traumasolution " + mytraumasolution);
//        mycasetolearn.setDescription(mytraumadescription);
//        mycasetolearn.setSolution(mytraumasolution);

        //I'll teach the casebase with the new case

        System.out.println("my casebase: " + mycases);
        System.out.println("casebase " + _caseBase);
        //test6
        ArrayList<CBRCase> casestoLearnt = new ArrayList<CBRCase>();
        casestoLearnt.add(mycasetolearn);

        HashMap<Attribute, Object> componentsKeys = new HashMap<Attribute, Object>();
        componentsKeys.put(new Attribute("Id", caseDescription.class), "theid");
        componentsKeys.put(new Attribute("Id", caseSolution.class), "theid");
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


    public CBRQuery getQuery(caseDescription request) {
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
            caseDescription desc = (caseDescription) mycase.getDescription();
            //modff
            CaseComponent casss = mycase.getDescription();
            System.out.println("CASSS");
            casss.getClass().toString();
            System.out.println("--------------");
            System.out.println("CASTED CASS");
            System.out.println((caseDescription)casss);
            //end modff

            System.out.println("Case description");
            System.out.println(desc);
            //i get the solution
            //beggining of modifications
            //before getting it i will retrieve the id and modify the id and intead change it from the database since i have the id
            MaladieInsertRepo mip = new MaladieInsertRepo();

//            mycase.setSolution(mip.manualSolutionMaking(desc.getId()));

            //end of modification
            caseSolution sol = (caseSolution) mycase.getSolution();
            System.out.println("Case solution");
            System.out.println(sol);
        }
    }


}
