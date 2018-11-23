package models;

import models.Parts;

public class Ram extends Parts {
	//Attributes
	int stickAmt;
	int totalGB;
	String memType;
	int memSpeed;
	String partType;
	
	//Constructors
	public Ram() {
		super();
		setStickAmt(1);
		setTotalGB(2);
		setMemType("unknown");
		setMemSpeed(1);
		setPartType("RAM");
	}
	public Ram(String vendor, String partName, int cost,
			int stickAmt, int totalGB, String memType, int memSpeed) {
		super(vendor,partName,cost);
		setStickAmt(stickAmt);
		setTotalGB(totalGB);
		setMemType(memType);
		setMemSpeed(memSpeed);
		setPartType("RAM");
	}
	
	//Accessors
	public int getStickAmt() {
		return stickAmt;
	}
	public int getTotalGB() {
		return totalGB;
	}
	public String getMemType() {
		return memType;
	}
	public int getMemSpeed() {
		return memSpeed;
	}
	public String getPartType() {
		return partType;
	}
	
	//Mutators
	public void setStickAmt(int stickAmt) {
		this.stickAmt = stickAmt;
	}
	public void setTotalGB(int totalGB) {
		this.totalGB = totalGB;
	}
	public void setMemType(String memType) {
		this.memType = memType;
	}
	public void setMemSpeed(int memSpeed) {
		this.memSpeed = memSpeed;
	}
	public void setPartType(String partType) {
		this.partType = partType;
	}
	
	//Methods
	public String gbPerStickCalc() {
		
		int gbPerStick = totalGB/stickAmt;
		String errorRam = "Total RAM and Stick Amount do not work!";
		
		if (gbPerStick % 2 == 0) { //ensures that the gb per ram stick are even, no remainders
			return Integer.toString(gbPerStick);
		} else {
			return errorRam;
		}
	}
	
	//Print method
	public void print() {
		System.out.println("Part Type: " + getPartType());
		super.print();
		System.out.print("Amount of RAM sticks: " + getStickAmt() +
						"\nTotal GB of RAM: " + getTotalGB() +
						"\nGB per RAM Stick: " + gbPerStickCalc() +
						"\nRAM Memory Type: " + getMemType() + 
						"\nRAM Memory Speed: " + getMemSpeed());
	}
}
