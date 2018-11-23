package models;

import models.Parts;

public class Gpu extends Parts {
	//Attributes
	int vRam;
	double clockSpeed;
	int cudaCore;
	String slotType;
	String partType;
	
	//Constructors
	public Gpu() {
		super();
		setVRam(4);
		setClockSpeed(1000);
		setCudaCore(4);
		setSlotType("PCI");
		setPartType("GPU");
	}
	public Gpu(String vendor, String partName, int cost,
			int vRam, double clockSpeed, int cudaCore, String slotType) {
		super(vendor,partName,cost);
		setVRam(vRam);
		setClockSpeed(clockSpeed);
		setCudaCore(cudaCore);
		setSlotType(slotType);
		setPartType("GPU");
	}
	
	//Accessors
	public int getVRam() {
		return vRam;
	}
	public double getClockSpeed() {
		return clockSpeed;
	}
	public int getCudaCore() {
		return cudaCore;
	}
	public String getSlotType() {
		return slotType;
	}
	public String getPartType() {
		return partType;
	}
	
	//Mutators
	public void setVRam(int vRam) {
		this.vRam = vRam;
	}
	public void setClockSpeed(double clockSpeed) {
		this.clockSpeed = clockSpeed;
	}
	public void setCudaCore(int cudaCore) {
		this.cudaCore = cudaCore;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	public void setPartType(String partType) {
		this.partType = partType;
		
	}
	
	//Print Method
	public void print() {
		System.out.println("Part Type: " + getPartType());
		super.print();
		System.out.print("vRAM Amount: " + getVRam() +
						"\nClock Speed: " + getClockSpeed() +
						"\nCUDA Cores: " + getCudaCore() +
						"\nSlot Interface: " + getSlotType());
	}
}
