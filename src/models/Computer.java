package models;

import models.interfaces.successFactors;
import models.Motherboard;
import builder.PartsListHelper;

import java.util.ArrayList;
import java.util.List;

public class Computer implements successFactors {
	//Attributes
	ArrayList<Parts> partList; //builds an array list using class Parts to hold all the computer parts
	int totCost; //total cost of the computer
	int budget; //desired budget for the computer
	
	//Constructor
	public Computer() {
		this.partList = new ArrayList<>();
		setTotCost(0);
		setBudget(0);
	}
	public Computer(int budget) {
		this.partList = new ArrayList<>();
		setTotCost(0);
		setBudget(budget);
	}
	
	//Accessors
	public ArrayList<Parts> getPartList() {
		return partList;
	}
	public int getTotCost() {
		return totCost;
	}
	public int getBudget() {
		return budget;
	}
	
	//Mutators
	public boolean addPart(Parts part) { //will take in the desired object and add it
		this.partList.add(part);
		setTotCost(calcTotCost());
		return isCompatible();
	}
	public void removePart(Parts part) { //will take in the desired object and remove it
		this.partList.remove(part);
	}
	protected void setTotCost(int totCost) {
		this.totCost = totCost;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	//Methods
	public boolean isCompatible() { //checks to see if the build of the computer is compatible, by checking amt of mobos and calling the compatibility methods
		List<Parts> partBin = PartsListHelper.findPartsByType(partList, "MOBO"); //creates a separate list of motherboards from the overall partList
		if (partBin.size() == 0 || partBin.size() > 1) { //if statement that only allows 1 motherboard for compatibility
			return false;
		}
		Motherboard mobo = (Motherboard) partBin.get(0); //pulls the motherboard from the partBin
		return mobo.isCompatibleComplete(partList); //checks the mobo against other parts by calling the compatibility methods, returns true or false
	}
	public boolean isInBudget() { //checks to see if the computer build is within budget
		if (totCost <= getBudget()) { //simple if statement to check if total cost is less than budget
			return true;
		} else {
			return false;
		}
	}
	private int calcTotCost() { //calculates the total cost of all parts
		int tempCost = 0;
		for (int i = 0; i < partList.size(); i++) {
			tempCost += partList.get(i).getCost();
		}
		return tempCost;
	}
	
	//Print method
	public void print() {
		if (isInBudget() == true) {
			System.out.println("The computer is within your budget of $" + getBudget() + ", the total cost is $" + getTotCost());
		} else {
			int overBudget = -(getBudget() - getTotCost());
			System.out.println("This computer is not within your budget by $" 
								+ Integer.toString(overBudget) + ".");
		}
		if (isCompatible() == true) {
			System.out.println("The computer parts are all compatible.");
		} else {
			System.out.println("The parts list has one or more incompatible parts.");
		}
		System.out.println("\nFull Part List:");
		for (int i = 0; i < partList.size(); i++) { //simple for loop to iterate through the partList and print the names of each part
			System.out.println(partList.get(i).getPartType() + ": " + partList.get(i).getPartName());
		}
	}
	
}
