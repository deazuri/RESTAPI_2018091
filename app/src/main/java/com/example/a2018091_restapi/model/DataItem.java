package com.example.a2018091_restapi.model;

import java.util.List;

public class DataItem{
	private String provinsi;
	private String kota;
	private String telp;
	private String sourceData;
	private String latitude;
	private String alamat;
	private String nama;
	private String kode;
	private String kelasRs;
	private String jenisFaskes;
	private int id;
	private List<DetailItem> detail;
	private String longitude;
	private String status;

	public void setProvinsi(String provinsi){
		this.provinsi = provinsi;
	}

	public String getProvinsi(){
		return provinsi;
	}

	public void setKota(String kota){
		this.kota = kota;
	}

	public String getKota(){
		return kota;
	}

	public void setTelp(String telp){
		this.telp = telp;
	}

	public String getTelp(){
		return telp;
	}

	public void setSourceData(String sourceData){
		this.sourceData = sourceData;
	}

	public String getSourceData(){
		return sourceData;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return alamat;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setKode(String kode){
		this.kode = kode;
	}

	public String getKode(){
		return kode;
	}

	public void setKelasRs(String kelasRs){
		this.kelasRs = kelasRs;
	}

	public String getKelasRs(){
		return kelasRs;
	}

	public void setJenisFaskes(String jenisFaskes){
		this.jenisFaskes = jenisFaskes;
	}

	public String getJenisFaskes(){
		return jenisFaskes;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDetail(List<DetailItem> detail){
		this.detail = detail;
	}

	public List<DetailItem> getDetail(){
		return detail;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"provinsi = '" + provinsi + '\'' + 
			",kota = '" + kota + '\'' + 
			",telp = '" + telp + '\'' + 
			",source_data = '" + sourceData + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",alamat = '" + alamat + '\'' + 
			",nama = '" + nama + '\'' + 
			",kode = '" + kode + '\'' + 
			",kelas_rs = '" + kelasRs + '\'' + 
			",jenis_faskes = '" + jenisFaskes + '\'' + 
			",id = '" + id + '\'' + 
			",detail = '" + detail + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}