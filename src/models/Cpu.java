package models;

import models.Parts;

public class Cpu extends Parts {
	//Attributes
	double clockSpeed;
	int coreAmt;
	String socketType; 
	String memSupp;
	String partType;
	
	//Constructors
	public Cpu() {
		super();
		setClockSpeed(0);
		setCoreAmt(0);
		setSocketType("unknown");
		setMemSupp("unknown");
		setPartType("CPU");
	}
	public Cpu(String vendor, String partName, int cost,
			double clockSpeed, int coreAmt, String socketType, String memSupp) {
		super(vendor,partName,cost);
		setClockSpeed(clockSpeed);
		setCoreAmt(coreAmt);
		setSocketType(socketType);
		setMemSupp(memSupp);
		setPartType("CPU");
	}
	
	//Accessors
	public double getClockSpeed() {
		return clockSpeed;
	}
	public int getCoreAmt() {
		return coreAmt;
	}
	public String getSocketType() {
		return socketType;
	}
	public String getMemSupp() {
		return memSupp;
	}
	public String getPartType() {
		return partType;
	}
	
	//Mutators
	public void setClockSpeed(double clockSpeed) {
		this.clockSpeed = clockSpeed;
	}
	public void setCoreAmt(int coreAmt) {
		this.coreAmt = coreAmt;
	}
	public void setSocketType(String socketType) {
		this.socketType = socketType;
	}
	public void setMemSupp(String memSupp) {
		this.memSupp = memSupp;
	}
	public void setPartType(String partType) {
		this.partType = partType;
	}
	
	//Print method
	public void print() {
		System.out.println("Part Type: " + getPartType());
		super.print();
		System.out.print("Clock Speed: " + getClockSpeed() +
							"\nCore Amount: " + getCoreAmt() +
							"\nSocket Type: " + getSocketType() +
							"\nMemory Supported: " + getMemSupp() + "\n");
	}

}
