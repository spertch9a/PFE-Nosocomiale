package com.ouss.reanimation.model;



public class TraumaDescriptionDTO {

	String  Id;
	double  Temperature;
	double Age;
	String glasgow;
	double Poids;
	String  conscient;
	String  convulsion,vomissement ,tempextr;
	String diurese,fracture;
	String Pas,pad;
	String trc;
	String marbure,cyanose,tonus;
	String Oedeme,hemoragie;
	String corpsE;
	String rales;
	String motrice,EncBranchique,mouvement,reflexe,sexe;
	String spo2;
	String Fc;
	String fr;
	String Sedation;
	String o2ther;
	String intubation;
	String ssi;
	String Osmotherapie,pic,classe,ventilation,supportHemo ;

	public TraumaDescriptionDTO(String id, double temperature, double age,
								String glasgow, double poids, String conscient,
								String convulsion, String vomissement, String tempextr,
								String diurese, String fracture, String pas, String pad, String trc,
								String marbure, String cyanose, String tonus, String oedeme, String hemoragie,
								String corpsE, String rales, String motrice, String encBranchique, String mouvement,
								String reflexe, String sexe, String spo2, String fc, String fr, String sedation, String o2ther,
								String intubation, String ssi, String osmotherapie, String pic, String classe, String ventilation, String supportHemo) {
		Id = id;
		Temperature = temperature;
		Age = age;
		this.glasgow = glasgow;
		Poids = poids;
		this.conscient = conscient;
		this.convulsion = convulsion;
		this.vomissement = vomissement;
		this.tempextr = tempextr;
		this.diurese = diurese;
		this.fracture = fracture;
		Pas = pas;
		this.pad = pad;
		this.trc = trc;
		this.marbure = marbure;
		this.cyanose = cyanose;
		this.tonus = tonus;
		Oedeme = oedeme;
		this.hemoragie = hemoragie;
		this.corpsE = corpsE;
		this.rales = rales;
		this.motrice = motrice;
		EncBranchique = encBranchique;
		this.mouvement = mouvement;
		this.reflexe = reflexe;
		this.sexe = sexe;
		this.spo2 = spo2;
		Fc = fc;
		this.fr = fr;
		Sedation = sedation;
		this.o2ther = o2ther;
		this.intubation = intubation;
		this.ssi = ssi;
		Osmotherapie = osmotherapie;
		this.pic = pic;
		this.classe = classe;
		this.ventilation = ventilation;
		this.supportHemo = supportHemo;
	}
}
