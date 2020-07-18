package Bicycle;

import java.util.ArrayList;
import java.util.Hashtable;
//import java.util.Properties; 

public class Bicycle {
	private String size;
	private Parts parts;

	public Parts getParts() {
		return parts;
	}

	public void setParts(Parts parts) {
		this.parts = parts;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}


	public Bicycle(Hashtable<String, Object> passBicycle) {
		setSize((String) passBicycle.get("size")); // Assuming size will always be provided
		setParts((Parts) passBicycle.get("parts"));
	}

	public ArrayList<Part> spares() {
		return getParts().spares();
	}
	
	public static void main(String[] args) {
		Object[][] roadBikeSet = {{"chain","50-size",true},{"tire","200",true}};
		Object[][] mountainBikeSet = {{"chain","100-size",true},{"tire","500",true},{"rearShock","owl",false}};
		Bicycle roadBicycle = new Bicycle(new Hashtable<>() {{ put("size","L");put("parts",PartsFactory.create(roadBikeSet)); }});
		System.out.println(roadBicycle.spares());
	}
}