package Bicycle;

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
		setParts((Parts) passBicycle.get("Parts"));
	}

	public Hashtable<String, Object> spares() {
		return parts.spares();
	}
	
	public static void main(String[] args) {
		Hashtable<String, Object> roadPassParts = new Hashtable<>() {
			{
				put("tireSize","100");
				put("chain","20-speed");
				put("tapeColour","voilet");
			}
		};
		Parts roadParts = new RoadBicycleParts(roadPassParts);
		Hashtable<String, Object> passBicycle = new Hashtable<>() {
			{
				put("size","25.78");
				put("Parts",roadParts);
			}
		};
		Bicycle roadBicycle = new Bicycle(passBicycle);
		System.out.println(roadBicycle.spares());
		
		Hashtable<String, Object> mountainPassParts = new Hashtable<>() {
			{
				put("tireSize","200");
				put("chain","40-speed");
				put("rearShock","FAR");
			}
		};
		Parts mountainParts = new MountainBicycleParts(mountainPassParts );
		Hashtable<String, Object> passBicycleNew = new Hashtable<>() {
			{
				put("size","25.78");
				put("Parts",mountainParts);
			}
		};
		Bicycle mountainBicycle = new Bicycle(passBicycleNew);
		System.out.println(mountainBicycle .spares());

	}
}