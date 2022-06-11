package com.example.demo.demo.model;


import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class caseDescription implements CaseComponent {

    String id;
    String nip; //in memoir it should be int
    String j; //jour d'admission
    String sa; // symptomes 48h apres admission
    String ht; //hypo tension
    String sec; //secretions
    String su; //sonde urinaire
    String pyu; //pyurie
    String dsp; //douleur sus-pubienne
    String fr,kt,abl,infkt, lu, brm, des, aus, msec,rx,tou,dys;

    double gb; //globules blancs shoud be int

    double t; //temperature
    double crp, pct; //marqeur d'inflammation, marqeur d'infection


    public String toString() {
        return "(" + id + ";" + nip + ";" + j + ";" + sa + ";" + t + ";" + ht + ";" + aus + ";" + des + ";" + kt + ";" + abl + ";" + infkt + ";" + sec + ";" + msec + ";" + tou + ";" + dys + ";" + su + ";" + pyu + ";" + brm + ";" + dsp + ";" + fr + ";" + lu + ";" + gb + ";" + crp + ";" + pct + ";" + rx + ")";
    }
	/*public String toString()
	{
		return "("+Id+";"+nip+";"+j+";"+sa+";"+t+";"+ht+";"+gb+";"+crp+";"+pct+";"+rx+";"+sec+";"+msec+";"+tou+";"+dys+";"+aus+";"+des+";"+su+";"+pyu+";"+brm+";"+dsp+";"+lu+";"+fr+";"+kt+";"+abl+";"+infkt+")";
	}*/


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }




    public String getJ() {
        return j;
    }
    public void setJ(String j) {
        this.j = j;
    }




    public String getSa() {
        return sa;
    }
    public void setSa(String sa) {
        this.sa = sa;
    }




    public double getT() {
        return t;
    }
    public void setT(double t) {
        this.t = t;
    }




    public String getHt() {
        return ht;
    }
    public void setHt(String ht) {
        this.ht = ht;
    }




    public double getGb() {
        return gb;
    }
    public void setGb(double gb) {
        this.gb = gb;
    }




    public double getCrp() {
        return crp;
    }
    public void setCrp(double crp) {
        this.crp = crp;
    }




    public double getPct() {
        return pct;
    }
    public void setPct(double pct) {
        this.pct = pct;
    }




    public String getRx() {
        return rx;
    }
    public void setRx(String rx) {
        this.rx = rx;
    }



    public String getSec() {
        return sec;
    }
    public void setSec(String sec) {
        this.sec = sec;
    }




    public String getMsec() {
        return msec;
    }
    public void setMsec(String msec) {
        this.msec = msec;
    }




    public String getTou() {
        return tou;
    }
    public void setTou(String tou) {
        this.tou = tou;
    }




    public String getDys() {
        return dys;
    }
    public void setDys(String dys) {
        this.dys = dys;
    }



    public String getAus() {
        return aus;
    }
    public void setAus(String aus) {
        this.aus = aus;
    }



    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }



    public String getSu() {
        return su;
    }
    public void setSu(String su) {
        this.su = su;
    }



    public String getPyu() {
        return pyu;
    }
    public void setPyu(String pyu) {
        this.pyu = pyu;
    }



    public String getBrm() {
        return brm;
    }
    public void setBrm(String brm) {
        this.brm = brm;
    }



    public String getDsp() {
        return dsp;
    }
    public void setDsp(String dsp) {
        this.dsp = dsp;
    }




    public String getLu() {
        return lu;
    }
    public void setLu(String lu) {
        this.lu = lu;
    }




    public String getFr() {
        return fr;
    }
    public void setFr(String fr) {
        this.fr = fr;
    }




    public String getKt() {
        return kt;
    }
    public void setKt(String kt) {
        this.kt = kt;
    }



    public String getAbl() {
        return abl;
    }
    public void setAbl(String abl) {
        this.abl = abl;
    }




    public String getInfkt() {
        return infkt;
    }
    public void setInfkt(String infkt) {
        this.infkt = infkt;
    }




    public Attribute getIdAttribute() {
        return new Attribute("id", this.getClass());
    }



}




