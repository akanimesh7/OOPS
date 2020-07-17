package Bicycle;

import java.util.ArrayList;
import java.util.Hashtable;

public class Parts {
	private ArrayList<Part> parts;
	
	public ArrayList<Part> getParts() {
		return parts;
	}

	public void setParts(ArrayList<Part> parts) {
		this.parts = parts;
	}

	public Parts(ArrayList<Part> partArray) {
		setParts(partArray);
	}
	
	public ArrayList<Part> spares() {
		ArrayList<Part> returnArray = new ArrayList<>();
		for(Part part:parts) {
			if(part.isSpare()) {
				returnArray.add(part);
			}
		}
		return returnArray;
	}
}
