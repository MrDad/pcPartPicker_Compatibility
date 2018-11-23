package models;

import models.interfaces.partSKU;

public abstract class Parts implements partSKU { //Abstract class for all Parts
	//Attributes
	String vendor;
	String partName;
	int cost;

	//Constructors
	public Parts() {
		setVendor("unknown");
		setPartName("unknown");
		setCost(0);
	}
	public Parts(String vendor, String partName, int cost) {
		setVendor(vendor);
		setPartName(partName);
		setCost(cost);
	}
	
	//Accessors
	public String getVendor() {
		return vendor;
	}
	public String getPartName() {
		return partName;
	}
	public int getCost() {
		return cost;
	}
	public abstract String getPartType();
	
	//Mutators
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public abstract void setPartType(String partType);
	
	//Print method
	public void print() {
		System.out.println("Vendor Name: " + getVendor() +
							"\nPart Name: " + getPartName() +
							"\nCost: " + getCost());
	}
	
}
