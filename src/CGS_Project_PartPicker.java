//****************************************//
//****************************************//
//            Anthony Haddad's            //
//        PC Compatibility Builder        //
//****************************************//
//****************************************//
//           Made For CGS 3416            //
//           Fall 2018 Project            //
//****************************************//
//****************************************//

import models.*;

public class CGS_Project_PartPicker {

	public static void main(String[] args) {
		
		//Computer Build 1
			//build computer object and set budget
		Computer com1 = new Computer();
		com1.setBudget(15000);
			//build computer parts objects
		Motherboard mobo1 = new Motherboard();
		Cpu cpu1 = new Cpu();
		Gpu gpu1 = new Gpu();
		Ram ram1 = new Ram();
		Psu psu1 = new Psu();
		Storage drive1 = new Storage();
			//MOBO data input
		mobo1.setCost(698);
		mobo1.setCpuType("Intel");
		mobo1.setFormFactor("ATX");
		mobo1.setM2Amt(0);
		mobo1.setMaxMemSupp(32);
		mobo1.setMemSlotAmt(4);
		mobo1.setMemSpeedSupp(1866);
		mobo1.setMemTypeSupp("DDR3");
		mobo1.setPartName("Asus Sabertooth Z97 Mark1/USB 3.1");
		mobo1.setPartType("MOBO");
		mobo1.setPciAmt(2);
		mobo1.setPciType("PCI 3.0");
		mobo1.setSataAmt(6);
		mobo1.setSocketSupp("LGA 1150");
		mobo1.setVendor("Newegg");
			//CPU data input
		cpu1.setPartType("CPU");
		cpu1.setPartName("Intel i7 4790K");
		cpu1.setVendor("Newegg");
		cpu1.setCost(525);
		cpu1.setClockSpeed(4.4);
		cpu1.setCoreAmt(4);
		cpu1.setMemSupp("64-Bit");
		cpu1.setSocketType("LGA 1150");
			//GPU data input
		gpu1.setClockSpeed(1.2);
		gpu1.setCost(10560);
		gpu1.setCudaCore(5120);
		gpu1.setPartName("PNY Quadro GV100");
		gpu1.setPartType("GPU");
		gpu1.setSlotType("PCI 3.0");
		gpu1.setVendor("Newegg");
		gpu1.setVRam(32);
			//RAM data input
		ram1.setCost(438);
		ram1.setMemSpeed(1600);
		ram1.setMemType("DDR3");
		ram1.setPartName("Corsair XMS 32GB (4x8GB)");
		ram1.setPartType("RAM");
		ram1.setStickAmt(4);
		ram1.setTotalGB(32);
		ram1.setVendor("Amazon");
			//PSU data input
		psu1.setCost(486);
		psu1.setGrade("Titanium");
		psu1.setMaxPower(1500);
		psu1.setModular("Fully-Modular");
		psu1.setPartName("Corsair AX1500i");
		psu1.setPartType("PSU");
		psu1.setPsuFormFactor("ATX");
		psu1.setVendor("OutletPC");
			//Storage data input
		drive1.setCost(1200);
		drive1.setDriveType("SSD");
		drive1.setInterfaceType("SATA");
		drive1.setMemCapacity(4);
		drive1.setPartName("Samsung 860 Pro");
		drive1.setPartType("Storage");
		drive1.setVendor("Samsung");
			//add parts to computer
		com1.addPart(mobo1);
		com1.addPart(cpu1);
		com1.addPart(gpu1);
		com1.addPart(ram1);
		com1.addPart(psu1);
		com1.addPart(drive1);
			//print the computer and determine whether it fits budget and compatibility
		System.out.println("Computer Build 1 - In Budget and Compatible Example");
		com1.print();
		System.out.println("\n------------------------------------------------------------\n");
		
		//Computer Build 2
			//build computer object and set budget
		Computer com2 = new Computer();
		com2.setBudget(10000);
			//build computer parts objects
		Motherboard mobo2 = new Motherboard();
		Cpu cpu2 = new Cpu();
		Gpu gpu2 = new Gpu();
		Ram ram2 = new Ram();
		Psu psu2 = new Psu();
		Storage drive2 = new Storage();
			//MOBO data input
		mobo2.setCost(698);
		mobo2.setCpuType("Intel");
		mobo2.setFormFactor("ATX");
		mobo2.setM2Amt(0);
		mobo2.setMaxMemSupp(32);
		mobo2.setMemSlotAmt(4);
		mobo2.setMemSpeedSupp(1866);
		mobo2.setMemTypeSupp("DDR3");
		mobo2.setPartName("Asus Sabertooth Z97 Mark1/USB 3.1");
		mobo2.setPartType("MOBO");
		mobo2.setPciAmt(2);
		mobo2.setPciType("PCI 3.0");
		mobo2.setSataAmt(6);
		mobo2.setSocketSupp("LGA 1150");
		mobo2.setVendor("Newegg");
			//CPU data input
		cpu2.setPartType("CPU");
		cpu2.setPartName("Intel i7 4790K");
		cpu2.setVendor("Newegg");
		cpu2.setCost(525);
		cpu2.setClockSpeed(4.4);
		cpu2.setCoreAmt(4);
		cpu2.setMemSupp("64-Bit");
		cpu2.setSocketType("LGA 1150");
			//GPU data input
		gpu2.setClockSpeed(1.2);
		gpu2.setCost(10560);
		gpu2.setCudaCore(5120);
		gpu2.setPartName("PNY Quadro GV100");
		gpu2.setPartType("GPU");
		gpu2.setSlotType("PCI 3.0");
		gpu2.setVendor("Newegg");
		gpu2.setVRam(32);
			//RAM data input
		ram2.setCost(438);
		ram2.setMemSpeed(1600);
		ram2.setMemType("DDR3");
		ram2.setPartName("Corsair XMS 32GB (4x8GB)");
		ram2.setPartType("RAM");
		ram2.setStickAmt(4);
		ram2.setTotalGB(32);
		ram2.setVendor("Amazon");
			//PSU data input
		psu2.setCost(486);
		psu2.setGrade("Titanium");
		psu2.setMaxPower(1500);
		psu2.setModular("Fully-Modular");
		psu2.setPartName("Corsair AX1500i");
		psu2.setPartType("PSU");
		psu2.setPsuFormFactor("ATX");
		psu2.setVendor("OutletPC");
			//Storage data input
		drive2.setCost(1200);
		drive2.setDriveType("SSD");
		drive2.setInterfaceType("SATA");
		drive2.setMemCapacity(4);
		drive2.setPartName("Samsung 860 Pro");
		drive2.setPartType("Storage");
		drive2.setVendor("Samsung");
			//add parts to computer
		com2.addPart(mobo2);
		com2.addPart(cpu2);
		com2.addPart(gpu2);
		com2.addPart(ram2);
		com2.addPart(psu2);
		com2.addPart(drive2);
			//print the computer and determine whether it fits budget and compatibility
		System.out.println("Computer Build 2 - Out Budget but Compatible Example");
		com2.print();
		System.out.println("\n------------------------------------------------------------\n");
		
		//Computer Build 3
			//build computer object and set budget
		Computer com3 = new Computer();
		com3.setBudget(15000);
			//build computer parts objects
		Motherboard mobo3 = new Motherboard();
		Cpu cpu3 = new Cpu();
		Gpu gpu3 = new Gpu();
		Ram ram3 = new Ram();
		Psu psu3 = new Psu();
		Storage drive3 = new Storage();
			//MOBO data input
		mobo3.setCost(698);
		mobo3.setCpuType("Intel");
		mobo3.setFormFactor("ATX");
		mobo3.setM2Amt(0);
		mobo3.setMaxMemSupp(32);
		mobo3.setMemSlotAmt(4);
		mobo3.setMemSpeedSupp(1866);
		mobo3.setMemTypeSupp("DDR3");
		mobo3.setPartName("Asus Sabertooth Z97 Mark1/USB 3.1");
		mobo3.setPartType("MOBO");
		mobo3.setPciAmt(2);
		mobo3.setPciType("PCI 3.0");
		mobo3.setSataAmt(6);
		mobo3.setSocketSupp("LGA 1150");
		mobo3.setVendor("Newegg");
			//CPU data input
		cpu3.setPartType("CPU");
		cpu3.setPartName("AMD ThreadRipper 2990WX 3");
		cpu3.setVendor("Newegg");
		cpu3.setCost(1600);
		cpu3.setClockSpeed(4.2);
		cpu3.setCoreAmt(32);
		cpu3.setMemSupp("64-Bit");
		cpu3.setSocketType("TR4");
			//GPU data input
		gpu3.setClockSpeed(1.2);
		gpu3.setCost(10560);
		gpu3.setCudaCore(5120);
		gpu3.setPartName("PNY Quadro GV100");
		gpu3.setPartType("GPU");
		gpu3.setSlotType("PCI 3.0");
		gpu3.setVendor("Newegg");
		gpu3.setVRam(32);
			//RAM data input
		ram3.setCost(438);
		ram3.setMemSpeed(1600);
		ram3.setMemType("DDR3");
		ram3.setPartName("Corsair XMS 32GB (4x8GB)");
		ram3.setPartType("RAM");
		ram3.setStickAmt(4);
		ram3.setTotalGB(32);
		ram3.setVendor("Amazon");
			//PSU data input
		psu3.setCost(486);
		psu3.setGrade("Titanium");
		psu3.setMaxPower(1500);
		psu3.setModular("Fully-Modular");
		psu3.setPartName("Corsair AX1500i");
		psu3.setPartType("PSU");
		psu3.setPsuFormFactor("ATX");
		psu3.setVendor("OutletPC");
			//Storage data input
		drive3.setCost(1200);
		drive3.setDriveType("SSD");
		drive3.setInterfaceType("SATA");
		drive3.setMemCapacity(4);
		drive3.setPartName("Samsung 860 Pro");
		drive3.setPartType("Storage");
		drive3.setVendor("Samsung");
			//add parts to computer
		com3.addPart(mobo3);
		com3.addPart(cpu3);
		com3.addPart(gpu3);
		com3.addPart(ram3);
		com3.addPart(psu3);
		com3.addPart(drive3);
			//print the computer and determine whether it fits budget and compatibility
		System.out.println("Computer Build 3 - In Budget but not Compatible Example");
		com3.print();
		System.out.println("\n------------------------------------------------------------\n");
		
		//Computer Build 4
			//build computer object and set budget
		Computer com4 = new Computer();
		com4.setBudget(10000);
			//build computer parts objects
		Motherboard mobo4 = new Motherboard();
		Cpu cpu4 = new Cpu();
		Gpu gpu4 = new Gpu();
		Ram ram4 = new Ram();
		Psu psu4 = new Psu();
		Storage drive4 = new Storage();
			//MOBO data input
		mobo4.setCost(698);
		mobo4.setCpuType("Intel");
		mobo4.setFormFactor("ATX");
		mobo4.setM2Amt(0);
		mobo4.setMaxMemSupp(32);
		mobo4.setMemSlotAmt(4);
		mobo4.setMemSpeedSupp(1866);
		mobo4.setMemTypeSupp("DDR3");
		mobo4.setPartName("Asus Sabertooth Z97 Mark1/USB 3.1");
		mobo4.setPartType("MOBO");
		mobo4.setPciAmt(2);
		mobo4.setPciType("PCI 3.0");
		mobo4.setSataAmt(6);
		mobo4.setSocketSupp("LGA 1150");
		mobo4.setVendor("Newegg");
			//CPU data input
		cpu4.setPartType("CPU");
		cpu4.setPartName("AMD ThreadRipper 2990WX 3");
		cpu4.setVendor("Newegg");
		cpu4.setCost(1720);
		cpu4.setClockSpeed(4.2);
		cpu4.setCoreAmt(32);
		cpu4.setMemSupp("64-Bit");
		cpu4.setSocketType("TR4");
			//GPU data input
		gpu4.setClockSpeed(1.2);
		gpu4.setCost(10560);
		gpu4.setCudaCore(5120);
		gpu4.setPartName("PNY Quadro GV100");
		gpu4.setPartType("GPU");
		gpu4.setSlotType("PCI 3.0");
		gpu4.setVendor("Newegg");
		gpu4.setVRam(32);
			//RAM data input
		ram4.setCost(438);
		ram4.setMemSpeed(1600);
		ram4.setMemType("DDR3");
		ram4.setPartName("Corsair XMS 32GB (4x8GB)");
		ram4.setPartType("RAM");
		ram4.setStickAmt(4);
		ram4.setTotalGB(32);
		ram4.setVendor("Amazon");
			//PSU data input
		psu4.setCost(486);
		psu4.setGrade("Titanium");
		psu4.setMaxPower(1500);
		psu4.setModular("Fully-Modular");
		psu4.setPartName("Corsair AX1500i");
		psu4.setPartType("PSU");
		psu4.setPsuFormFactor("ATX");
		psu4.setVendor("OutletPC");
			//Storage data input
		drive4.setCost(1200);
		drive4.setDriveType("SSD");
		drive4.setInterfaceType("SATA");
		drive4.setMemCapacity(4);
		drive4.setPartName("Samsung 860 Pro");
		drive4.setPartType("Storage");
		drive4.setVendor("Samsung");
			//add parts to computer
		com4.addPart(mobo4);
		com4.addPart(cpu4);
		com4.addPart(gpu4);
		com4.addPart(ram4);
		com4.addPart(psu4);
		com4.addPart(drive4);
			//print the computer and determine whether it fits budget and compatibility
		System.out.println("Computer Build 4 - Out of Budget and Not Compatible Example");
		com4.print();
		
		
	}

}
