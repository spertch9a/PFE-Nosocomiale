package com.example.demo.demo.repository;

import com.example.demo.demo.DTO.CaseToRetainDTO;
import com.example.demo.demo.model.caseDescription;
import com.example.demo.demo.model.caseSolution;


import java.sql.*;

public class MaladieInsertRepo {
    static final String DB_URL = "jdbc:mysql://localhost:3306/nosocomiale";
    static final String USER = "SA";
    static final String PASS = "THEPASSWORD";
    public caseSolution manualSolutionMaking(String idOfCase) {
        caseSolution solll = new caseSolution();
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String query =  "SELECT p, u, b, skt, autr, pas, conf FROM casebase WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1,idOfCase);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                     solll.setId(idOfCase);
                     solll.setAutr(rs.getInt("autr"));
                solll.setB(rs.getInt("b"));
                solll.setConf(rs.getInt("conf"));
                solll.setSkt(rs.getInt("skt"));
                solll.setP(rs.getInt("p"));
                solll.setPas(rs.getInt("pas"));
                solll.setU(rs.getInt("u"));
//                solll.setClasse(rs.getString("classe"));
//                solll.setIntubation(rs.getString("intubation"));
//                solll.setOsmotherapie(rs.getString("osmotherapie"));
//                solll.setPic(rs.getString("pic"));
//                solll.setSedation(rs.getString("sedation"));
//                solll.setSsi(rs.getString("ssi"));
//                solll.setSupportHemo(rs.getString("supportHemo"));
//                solll.setVentilation(rs.getString("ventilation"));
//                solll.setO2ther(rs.getString("o2ther"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return solll;
    }
    public void caseInsert(CaseToRetainDTO mycasetoretain) {
        int mynewid = 1;
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Inserting ...");
            //https://www.tutorialspoint.com/jdbc/statement-object-example.htm
            PreparedStatement st = conn.prepareStatement("select id from malady where id = ?");
            st.setDouble(1,mynewid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                mynewid = Integer.parseInt(rs.getString(1));
                mynewid++;
                st.setDouble(1,mynewid);
                rs= st.executeQuery();
            }
            String sql = "Insert into malady (Age, sexe, Poids, Temperature, Pas, pad, Fc, tempextr, diurese," +
                    " marbure, trc, spo2, fr, cyanose, rales, EncBranchique, glasgow, tonus, conscient, convulsion," +
                    " vomissement, motrice, mouvement, reflexe, fracture, Oedeme, corpsE, hemoragie, o2ther, ssi, supportHemo," +
                    " sedation, intubation, ventilation, pic," +
                    " osmotherapie, Id) " +
                    "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            PreparedStatement pst = conn.prepareStatement(sql);
            caseDescription description = mycasetoretain.getDescription();
            caseSolution solution = mycasetoretain.getSolution();
//            pst.setDouble(1, description.getAge());
//            pst.setString(2, description.getSexe());
//            pst.setDouble(3, description.getPoids());
//            pst.setDouble(4, description.getTemperature());
//            pst.setString(5, description.getPas());
//            pst.setString(6, description.getPad());
//            pst.setString(7, description.getFc());
//            pst.setString(8, description.getTempextr());
//            pst.setString(9, description.getDiurese());
//            pst.setString(10, description.getMarbure());
//            pst.setString(11, description.getTrc());
//            pst.setString(12, description.getSpo2());
//            pst.setString(13, description.getFr());
//            pst.setString(14, description.getCyanose());
//            pst.setString(15, description.getRales());
//            pst.setString(16, description.getEncBranchique());
//            pst.setString(17, description.getGlasgow());
//            pst.setString(18, description.getTonus());
//            pst.setString(19, description.getConscient());
//            pst.setString(20, description.getConvulsion());
//            pst.setString(21, description.getVomissement());
//            pst.setString(22, description.getMotrice());
//            pst.setString(23, description.getMouvement());
//            pst.setString(24, description.getReflexe());
//            pst.setString(25, description.getFracture());
//            pst.setString(26, description.getOedeme());
//            pst.setString(27, description.getCorpsE());
//            pst.setString(28, description.getHemoragie());
//            pst.setString(29, solution.getO2ther());
//            pst.setString(30, solution.getSsi());
//            pst.setString(31, solution.getSupportHemo());
//            pst.setString(32, solution.getSedation());
//            pst.setString(33, solution.getIntubation());
//            pst.setString(34, solution.getVentilation());
//            pst.setString(35, solution.getVentilation());
//            pst.setString(36, solution.getPic());

            pst.setString(37, String.valueOf(mynewid));

            pst.executeUpdate();
            System.out.println("Case with Id " +mynewid + " has been added to the database!");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

}
