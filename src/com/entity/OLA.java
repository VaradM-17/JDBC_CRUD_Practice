package com.entity;

public class OLA {
	private int did;
	private String dname;
	private int dage;
	private int vehicalno;

	public OLA() {
	}

	public OLA(int did, String dname, int dage, int vehicalno) {
		this.did = did;
		this.dname = dname;
		this.dage = dage;
		this.vehicalno = vehicalno;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDage() {
		return dage;
	}

	public void setDage(int dage) {
		this.dage = dage;
	}

	public int getVehicalno() {
		return vehicalno;
	}

	public void setVehicalno(int vehicalno) {
		this.vehicalno = vehicalno;
	}

	@Override
	public String toString() {
		return "OLA [did=" + did + ", dname=" + dname + ", dage=" + dage + ", vehicalno=" + vehicalno + "]";
	}
}
