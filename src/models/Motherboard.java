package models;

import models.Parts;

import java.util.List;

public class Motherboard extends Parts {
	//Attributes
	String formFactor;
	String memTypeSupp;
	int memSpeedSupp;
	int memSlotAmt;
	int maxMemSupp;
	String socketSupp;
	String cpuType;
	int sataAmt;
	int m2Amt;
	int pciAmt;
	String pciType;
	String partType;
	
	//Constructors
	public Motherboard() {
		super();
		setFormFactor("unknown");
		setMemTypeSupp("unknown");
		setMemSpeedSupp(1);
		setMemSlotAmt(1);
		setMaxMemSupp(2);
		setSocketSupp("uknown");
		setCpuType("unknown");
		setSataAmt(1);
		setM2Amt(1);
		setPciAmt(1);
		setPciType("unknown");
		setPartType("MOBO");
	}
	public Motherboard(String vendor, String partName, int cost,
			String formFactor, String memTypeSupp, int memSpeedSupp, int memSlotAmt, int maxMemSupp, 
			String socketSupp, String cpuType, int sataAmt, int m2Amt, int pciAmt, String pciType) {
		super(vendor,partName,cost);
		setFormFactor(formFactor);
		setMemTypeSupp(memTypeSupp);
		setMemSpeedSupp(memSpeedSupp);
		setMemSlotAmt(memSlotAmt);
		setMaxMemSupp(maxMemSupp);
		setSocketSupp(socketSupp);
		setCpuType(cpuType);
		setSataAmt(sataAmt);
		setM2Amt(m2Amt);
		setPciAmt(pciAmt);
		setPciType(pciType);
		setPartType("MOBO");
	}
	//Accessors
	public String getFormFactor() {
		return formFactor;
	}
	public String getMemTypeSupp() {
		return memTypeSupp;
	}
	public int getMemSpeedSupp() {
		return memSpeedSupp;
	}
	public int getMemSlotAmt() {
		return memSlotAmt;
	}
	public int getMaxMemSupp() {
		return maxMemSupp;
	}
	public String getSocketSupp() {
		return socketSupp;
	}
	public String getCpuType() {
		return cpuType;
	}
	public int getSataAmt() {
		return sataAmt;
	}
	public int getM2Amt() {
		return m2Amt;
	}
	public int getPciAmt() {
		return pciAmt;
	}
	public String getPciType() {
		return pciType;
	}
	public String getPartType() {
		return partType;
	}
	
	//Mutators
	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}
	public void setMemTypeSupp(String memTypeSupp) {
		this.memTypeSupp = memTypeSupp;
	}
	public void setMemSpeedSupp(int memSpeedSupp) {
		this.memSpeedSupp = memSpeedSupp;
	}
	public void setMemSlotAmt(int memSlotAmt) {
		this.memSlotAmt = memSlotAmt;
	}
	public void setMaxMemSupp(int maxMemSupp) {
		this.maxMemSupp = maxMemSupp;
	}
	public void setSocketSupp(String socketSupp) {
		this.socketSupp = socketSupp;
	}
	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}
	public void setSataAmt(int sataAmt) {
		this.sataAmt = sataAmt;
	}
	public void setM2Amt(int m2Amt) {
		this.m2Amt = m2Amt;
	}
	public void setPciAmt(int pciAmt) {
		this.pciAmt = pciAmt;
	}
	public void setPciType(String pciType) {
		this.pciType = pciType;
	}
	public void setPartType(String partType) {
		this.partType = partType;
	}
	
	//Compatibility Methods
	public boolean isCpuCompatible(Cpu cpu) {
		if (cpu.getSocketType().equals(getSocketSupp())) {
			return true;
		}
		return false;
	}
	public boolean isRamCompatible(Ram ram) {
		if (ram.getMemType().equals(getMemTypeSupp()) 
				&& ram.getTotalGB() <= this.getMaxMemSupp() && 
				(ram.getMemSpeed() == this.getMemSpeedSupp() || ram.getMemSpeed() < this.getMemSpeedSupp())) {
			return true;
		}
		return false;
	}
	public boolean isGpuCompatible(Gpu gpu) {
		if (gpu.getSlotType().equals(getPciType())) {
			return true;
		}
		return false;
	}
	public boolean isStorageCompatible(Storage drives) {
		boolean sataDrive = false;
		boolean m2Drive = false;
		if (this.getSataAmt() > 0) {
			sataDrive = true;
		}
		if (this.getM2Amt() > 0) {
			m2Drive = true;
		}
		if ((drives.getInterfaceType().equals("SATA") && sataDrive == true) ||
				(drives.getInterfaceType().equals("M2") && m2Drive == true)) {
			return true;
		}
		return false;
	}
	public boolean isPowerCompatible(Psu psu) {
		if (psu.getPsuFormFactor().equals(getFormFactor())) {
			return true;
		}
		return false;
	}
	
	//this is a complete computer compatibility check, returns true only if all parts work together
	public boolean isCompatibleComplete(List<Parts> partList) {
		for(int i = 0; i < partList.size(); i++) { //for loop ensures we iterate through all parts
			String objectType = partList.get(i).getPartType();
			
			switch(objectType) {
			case ("CPU") : 
				if (isCpuCompatible((Cpu) partList.get(i)) != true) {
					return false;
				}
				break;
			case ("RAM") :
				if (isRamCompatible((Ram) partList.get(i)) != true) {
					return false;
				}
				break;
			case ("GPU") :
				if (isGpuCompatible((Gpu) partList.get(i)) != true) {
					return false;
				}
				break;
			case ("Storage") :
				if (isStorageCompatible((Storage) partList.get(i)) != true) {
					return false;
				}
				break;
			case ("PSU") :
				if (isPowerCompatible((Psu) partList.get(i)) != true) {
					return false;
				}
				break;
			default :
				break;
			}
		}
		return true;
	}
	
	//Print Method
	public void print() {
		System.out.println("Part Type: " + getPartType());
		super.print();
		System.out.print("Form Factor: " + getFormFactor() +
						"\nCPU Socket Support: " + getSocketSupp() + 
						"\nCPU Types Support: " + getCpuType() +
						"\nRAM Type Support: " + getMemTypeSupp() +
						"\nRAM Speed Support: " + getMemSpeedSupp() +
						"\nRAM Maximum Support: " + getMaxMemSupp() +
						"\nMaximum RAM Slots: " + getMemSlotAmt() +
						"\nMaximum SATA Support: " + getSataAmt() + 
						"\nMaximum M.2 Support: " + getM2Amt() +
						"\nPCI Slot Amount: " + getPciAmt() +
						"\nPCI Slot Type: " + getPciType());
		
	}
	
}
