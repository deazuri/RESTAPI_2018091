package com.example.a2018091_restapi.model;

public class DetailItem{
	private int batalVaksin;
	private int pendingVaksin1;
	private int pendingVaksin2;
	private String batch;
	private int divaksin1;
	private int divaksin;
	private int divaksin2;
	private String kode;
	private int pendingVaksin;
	private int id;
	private String tanggal;
	private int batalVaksin2;
	private int batalVaksin1;

	public void setBatalVaksin(int batalVaksin){
		this.batalVaksin = batalVaksin;
	}

	public int getBatalVaksin(){
		return batalVaksin;
	}

	public void setPendingVaksin1(int pendingVaksin1){
		this.pendingVaksin1 = pendingVaksin1;
	}

	public int getPendingVaksin1(){
		return pendingVaksin1;
	}

	public void setPendingVaksin2(int pendingVaksin2){
		this.pendingVaksin2 = pendingVaksin2;
	}

	public int getPendingVaksin2(){
		return pendingVaksin2;
	}

	public void setBatch(String batch){
		this.batch = batch;
	}

	public String getBatch(){
		return batch;
	}

	public void setDivaksin1(int divaksin1){
		this.divaksin1 = divaksin1;
	}

	public int getDivaksin1(){
		return divaksin1;
	}

	public void setDivaksin(int divaksin){
		this.divaksin = divaksin;
	}

	public int getDivaksin(){
		return divaksin;
	}

	public void setDivaksin2(int divaksin2){
		this.divaksin2 = divaksin2;
	}

	public int getDivaksin2(){
		return divaksin2;
	}

	public void setKode(String kode){
		this.kode = kode;
	}

	public String getKode(){
		return kode;
	}

	public void setPendingVaksin(int pendingVaksin){
		this.pendingVaksin = pendingVaksin;
	}

	public int getPendingVaksin(){
		return pendingVaksin;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTanggal(String tanggal){
		this.tanggal = tanggal;
	}

	public String getTanggal(){
		return tanggal;
	}

	public void setBatalVaksin2(int batalVaksin2){
		this.batalVaksin2 = batalVaksin2;
	}

	public int getBatalVaksin2(){
		return batalVaksin2;
	}

	public void setBatalVaksin1(int batalVaksin1){
		this.batalVaksin1 = batalVaksin1;
	}

	public int getBatalVaksin1(){
		return batalVaksin1;
	}

	@Override
 	public String toString(){
		return 
			"DetailItem{" + 
			"batal_vaksin = '" + batalVaksin + '\'' + 
			",pending_vaksin_1 = '" + pendingVaksin1 + '\'' + 
			",pending_vaksin_2 = '" + pendingVaksin2 + '\'' + 
			",batch = '" + batch + '\'' + 
			",divaksin_1 = '" + divaksin1 + '\'' + 
			",divaksin = '" + divaksin + '\'' + 
			",divaksin_2 = '" + divaksin2 + '\'' + 
			",kode = '" + kode + '\'' + 
			",pending_vaksin = '" + pendingVaksin + '\'' + 
			",id = '" + id + '\'' + 
			",tanggal = '" + tanggal + '\'' + 
			",batal_vaksin_2 = '" + batalVaksin2 + '\'' + 
			",batal_vaksin_1 = '" + batalVaksin1 + '\'' + 
			"}";
		}
}
