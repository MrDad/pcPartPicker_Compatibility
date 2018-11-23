package models.interfaces;

public interface successFactors {
	//interface for Computer to create an abstract blueprint for what Computer must do
	int getBudget();
	void setBudget(int budget);
	int getTotCost();
	boolean isCompatible();
	boolean isInBudget();
}
