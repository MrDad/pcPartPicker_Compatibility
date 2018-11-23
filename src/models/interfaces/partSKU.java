package models.interfaces;

public interface partSKU {
	//interface for Parts to create an abstract blueprint for what Parts must do
	String getVendor();
	void setVendor(String vendor);
	String getPartName();
	void setPartName(String partName);
	void print();
}
