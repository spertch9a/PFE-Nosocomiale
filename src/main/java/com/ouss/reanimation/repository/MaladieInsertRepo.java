package com.ouss.reanimation.repository;

import com.ouss.reanimation.DTO.CaseToRetainDTO;
import com.ouss.reanimation.model.TraumaDescription;
import com.ouss.reanimation.model.TraumaSolution;

import java.sql.*;

public class MaladieInsertRepo {
    static final String DB_URL = "jdbc:mysql://localhost:3306/hopital";
    static final String USER = "sa";
    static final String PASS = "thepassword";


    public void caseInsert(CaseToRetainDTO mycasetoretain) {
        int mynewid = 1;
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Inserting ...");
            //https://www.tutorialspoint.com/jdbc/statement-object-example.htm
            PreparedStatement st = conn.prepareStatement("select id from maladies where id = ?");
            st.setDouble(1,mynewid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                mynewid = Integer.parseInt(rs.getString(1));
                mynewid++;
                st.setDouble(1,mynewid);
                rs= st.executeQuery();
            }
            String sql = "Insert into maladies (Age, sexe, Poids, Temperature, Pas, pad, Fc, tempextr, diurese," +
                    " marbure, trc, spo2, fr, cyanose, rales, EncBranchique, glasgow, tonus, conscient, convulsion," +
                    " vomissement, motrice, mouvement, reflexe, fracture, Oedeme, corpsE, hemoragie, o2ther, ssi, supportHemo," +
                    " sedation, intubation, ventilation, pic," +
                    " osmotherapie, Id) " +
                    "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            PreparedStatement pst = conn.prepareStatement(sql);
            TraumaDescription description = mycasetoretain.getDescription();
            TraumaSolution solution = mycasetoretain.getSolution();
            pst.setDouble(1, description.getAge());
            pst.setString(2, description.getSexe());
            pst.setDouble(3, description.getPoids());
            pst.setDouble(4, description.getTemperature());
            pst.setString(5, description.getPas());
            pst.setString(6, description.getPad());
            pst.setString(7, description.getFc());
            pst.setString(8, description.getTempextr());
            pst.setString(9, description.getDiurese());
            pst.setString(10, description.getMarbure());
            pst.setString(11, description.getTrc());
            pst.setString(12, description.getSpo2());
            pst.setString(13, description.getFr());
            pst.setString(14, description.getCyanose());
            pst.setString(15, description.getRales());
            pst.setString(16, description.getEncBranchique());
            pst.setString(17, description.getGlasgow());
            pst.setString(18, description.getTonus());
            pst.setString(19, description.getConscient());
            pst.setString(20, description.getConvulsion());
            pst.setString(21, description.getVomissement());
            pst.setString(22, description.getMotrice());
            pst.setString(23, description.getMouvement());
            pst.setString(24, description.getReflexe());
            pst.setString(25, description.getFracture());
            pst.setString(26, description.getOedeme());
            pst.setString(27, description.getCorpsE());
            pst.setString(28, description.getHemoragie());
            pst.setString(29, solution.getO2ther());
            pst.setString(30, solution.getSsi());
            pst.setString(31, solution.getSupportHemo());
            pst.setString(32, solution.getSedation());
            pst.setString(33, solution.getIntubation());
            pst.setString(34, solution.getVentilation());
            pst.setString(35, solution.getVentilation());
            pst.setString(36, solution.getPic());

            pst.setString(37, String.valueOf(mynewid));

            pst.executeUpdate();
            System.out.println("Case with Id " +mynewid + " has been added to the database!");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public static void main(String[] args) {
//        // Open a connection
//        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//             Statement stmt = conn.createStatement();
//        ) {
//            // Execute a query
//            System.out.println("Inserting records into the table...");
//            String sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
//            stmt.executeUpdate(sql);
//            System.out.println("Inserted records into the table...");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
