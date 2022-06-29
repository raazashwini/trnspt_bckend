package com.example.demo.dto;

public class ChangePassDto {
	private String email;
	private String currPass;
	private String newPass;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCurrPass() {
		return currPass;
	}
	public void setCurrPass(String currPass) {
		this.currPass = currPass;
	}
	public String getNewPass() {
		return newPass;
	}
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}
	
	
}
