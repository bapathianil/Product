package com.product.demo;

public class Product {

	private int id;
	
	private String pname;
	
	private int pprice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public Product(int id, String pname, int pprice) {
		super();
		this.id = id;
		this.pname = pname;
		this.pprice = pprice;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
	
}
