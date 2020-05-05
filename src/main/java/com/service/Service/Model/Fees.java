package com.service.Service.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="fees")
public class Fees {
	@Id
	int f_id;
	double tuition_fee;
	double annual_charge;
	double library_charge;
	double sports_charge;
	String receipt_no;
	String receipt_date;
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public double getTution_fee() {
		return tuition_fee;
	}
	public void setTution_fee(double tution_fee) {
		this.tuition_fee = tution_fee;
	}
	public double getAnnual_charge() {
		return annual_charge;
	}
	public void setAnnual_charge(double annual_charge) {
		this.annual_charge = annual_charge;
	}
	public double getLibrary_charge() {
		return library_charge;
	}
	public void setLibrary_charge(double library_charge) {
		this.library_charge = library_charge;
	}
	public double getSports_charge() {
		return sports_charge;
	}
	public void setSports_charge(double sports_charge) {
		this.sports_charge = sports_charge;
	}
	public String getReceipt_no() {
		return receipt_no;
	}
	public void setReceipt_no(String receipt_no) {
		this.receipt_no = receipt_no;
	}
	public String getReceipt_date() {
		return receipt_date;
	}
	public void setReceipt_date(String receipt_date) {
		this.receipt_date = receipt_date;
	}
	
	
	
	
	

}
