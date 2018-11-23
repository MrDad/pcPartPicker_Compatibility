package models;

import models.Parts;

public class Storage extends Parts {
	//Attributes
	int memCapacity;
	String interfaceType;
	String driveType;
	String partType;
	
	//Constructors
	public Storage() {
		super();
		setMemCapacity(1);
		setInterfaceType("SATA");
		setDriveType("HDD");
		setPartType("Storage");
	}
	public Storage(String vendor, String partName, int cost, 
			int memCapacity, String interfaceType, String driveType) {
		super(vendor,partName,cost);
		setMemCapacity(memCapacity);
		setInterfaceType(interfaceType);
		setDriveType(driveType);
		setPartType("Storage");
	}
	
	//Accessors
	public int getMemCapacity() {
		return memCapacity;
	}
	public String getInterfaceType() {
		return interfaceType.toUpperCase();
	}
	public String getDriveType() {
		return driveType;
	}
	public String getPartType() {
		return partType;
	}
	
	//Mutators
	public void setMemCapacity(int memCapacity) {
		this.memCapacity = memCapacity;
	}
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}
	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}
	public void setPartType(String partType) {
		this.partType = partType;
	}
	
	//Print Method
	public void print() {
		System.out.println("Part Type: " + getPartType());
		super.print();
		System.out.print("Drive Type: " + getDriveType() +
						"\nInterface Type: " + getInterfaceType() +
						"\nDrive Memory Capacity: " + getMemCapacity());
	}
}
