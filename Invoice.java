package com.higradius;

import java.sql.Date;



public class invoice {

	 private String cust_name,notes;
	 private int invoice_id,cust_id,invoice_amount;
	 private Date due_date,predicted_date;
	public invoice(String cust_name, String notes, int invoice_id, int cust_id, int invoice_amount, Date due_date,
			Date predicted_date) {
		super();
		this.cust_name = cust_name;
		this.notes = notes;
		this.invoice_id = invoice_id;
		this.cust_id = cust_id;
		this.invoice_amount = invoice_amount;
		this.due_date = due_date;
		this.predicted_date = predicted_date;
	}
	public invoice() {
		super();
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public int getInvoice_amount() {
		return invoice_amount;
	}
	public void setInvoice_amount(int invoice_amount) {
		this.invoice_amount = invoice_amount;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public Date getPredicted_date() {
		return predicted_date;
	}
	public void setPredicted_date(Date predicted_date) {
		this.predicted_date = predicted_date;
	}
	 
	 
}
