package com.example.a2018091_restapi.model;

import java.util.List;

public class FaskesList{
	private int countTotal;
	private List<DataItem> data;
	private boolean success;
	private String message;

	public void setCountTotal(int countTotal){
		this.countTotal = countTotal;
	}

	public int getCountTotal(){
		return countTotal;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"FaskesList{" + 
			"count_total = '" + countTotal + '\'' + 
			",data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}