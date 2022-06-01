package com.example.demo.demo.DTO;


import es.ucm.fdi.gaia.jcolibri.cbrcore.Attribute;
import es.ucm.fdi.gaia.jcolibri.cbrcore.CaseComponent;

public class caseDescription implements CaseComponent {

    String id;
    String nip;
    String j;
    int sa;
    double t;
    int ht;
    double gb, crp, pct;
    int rx, sec, msec, tou, dys;
    int aus, des, su, pyu, brm, dsp, lu;
    int fr, kt, abl, infkt;

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




    public int getSa() {
        return sa;
    }
    public void setSa(int sa) {
        this.sa = sa;
    }




    public double getT() {
        return t;
    }
    public void setT(double t) {
        this.t = t;
    }




    public int getHt() {
        return ht;
    }
    public void setHt(int ht) {
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




    public int getRx() {
        return rx;
    }
    public void setRx(int rx) {
        this.rx = rx;
    }



    public int getSec() {
        return sec;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }




    public int getMsec() {
        return msec;
    }
    public void setMsec(int msec) {
        this.msec = msec;
    }




    public int getTou() {
        return tou;
    }
    public void setTou(int tou) {
        this.tou = tou;
    }




    public int getDys() {
        return dys;
    }
    public void setDys(int dys) {
        this.dys = dys;
    }



    public int getAus() {
        return aus;
    }
    public void setAus(int aus) {
        this.aus = aus;
    }



    public int getDes() {
        return des;
    }
    public void setDes(int des) {
        this.des = des;
    }



    public int getSu() {
        return su;
    }
    public void setSu(int su) {
        this.su = su;
    }



    public int getPyu() {
        return pyu;
    }
    public void setPyu(int pyu) {
        this.pyu = pyu;
    }



    public int  getBrm() {
        return brm;
    }
    public void setBrm(int brm) {
        this.brm = brm;
    }



    public int getDsp() {
        return dsp;
    }
    public void setDsp(int dsp) {
        this.dsp = dsp;
    }




    public int getLu() {
        return lu;
    }
    public void setLu(int lu) {
        this.lu = lu;
    }




    public int getFr() {
        return fr;
    }
    public void setFr(int fr) {
        this.fr = fr;
    }




    public int getKt() {
        return kt;
    }
    public void setKt(int kt) {
        this.kt = kt;
    }



    public int getAbl() {
        return abl;
    }
    public void setAbl(int abl) {
        this.abl = abl;
    }




    public int getInfkt() {
        return infkt;
    }
    public void setInfkt(int infkt) {
        this.infkt = infkt;
    }




    public Attribute getIdAttribute() {
        return new Attribute("id", this.getClass());
    }



}




