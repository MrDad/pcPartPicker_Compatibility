package models;

import models.Parts;

public class Psu extends Parts {
	//Attributes
	int maxPower;
	String modular;
	String grade;
	String psuFormFactor;
	String partType;
	
	//Constructors
	public Psu() {
		super();
		setMaxPower(200);
		setModular("Non-modular");
		setGrade("Bronze");
		setPsuFormFactor("ATX");
		setPartType("PSU");
	}
	public Psu(String vendor, String partName, int cost, 
			int maxPower, String modular, String grade, String psuFormFactor) {
		super(vendor,partName,cost);
		setMaxPower(maxPower);
		setModular(modular);
		setGrade(grade);
		setPsuFormFactor(psuFormFactor);
		setPartType("PSU");
	}
	//Accessors
	public int getMaxPower() {
		return maxPower;
	}
	public String getModular() {
		return modular;
	}
	public String getGrade() {
		return grade;
	}
	public String getPsuFormFactor() {
		return psuFormFactor;
	}
	public String getPartType() {
		return partType;
	}
	//Mutators
	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}
	public void setModular(String modular) {
		this.modular = modular;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setPsuFormFactor(String psuFormFactor) {
		this.psuFormFactor = psuFormFactor;
	}
	public void setPartType(String partType) {
		this.partType = partType;
	}
	
	//Print Method
	public void print() {
		System.out.println("Part Type: " + getPartType());
		super.print();
		System.out.print("Form Factor: " + getPsuFormFactor() +
						"\nWattage: " + getMaxPower() +
						"\nEnergy Efficiency Grade: " + getGrade() +
						"\nModularity: " + getModular());
	}
}
