package builder;

import java.util.ArrayList;
import java.util.List;
import models.Parts;

public class PartsListHelper { //this class is used to help with comparing parts
	public static List<Parts> findPartsByType(ArrayList<Parts> partList, String partType) { //finds all parts of a specific type from the partList
		ArrayList<Parts> partBin = new ArrayList<>();
		for(int i = 0; i < partList.size(); i++) {
			if (partList.get(i).getPartType().equals(partType)) {
				partBin.add(partList.get(i));
			}
		}
		return partBin;
	}
}
