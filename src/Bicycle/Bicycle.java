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
		return parts.spares();
	}
	
	public static void main(String[] args) {
//		Hashtable<String, Object> roadPassParts = new Hashtable<>() {
//			{
//				put("tireSize","100");
//				put("chain","20-speed");
//				put("tapeColour","voilet");
//			}
//		};
//		Parts roadParts = new RoadBicycleParts(roadPassParts);
//		Hashtable<String, Object> passBicycle = new Hashtable<>() {
//			{
//				put("size","25.78");
//				put("Parts",roadParts);
//			}
//		};
//		Bicycle roadBicycle = new Bicycle(passBicycle);
//		System.out.println(roadBicycle.spares());
//		
//		Hashtable<String, Object> mountainPassParts = new Hashtable<>() {
//			{
//				put("tireSize","200");
//				put("chain","40-speed");
//				put("rearShock","FAR");
//			}
//		};
//		Parts mountainParts = new MountainBicycleParts(mountainPassParts );
//		Hashtable<String, Object> passBicycleNew = new Hashtable<>() {
//			{
//				put("size","25.78");
//				put("Parts",mountainParts);
//			}
//		};
//		Bicycle mountainBicycle = new Bicycle(passBicycleNew);
//		System.out.println(mountainBicycle .spares());
//		----------------------------------------------------------------------------
		Hashtable<String,Object> chain = new Hashtable<>() {
			{
				put("name","chain");
				put("description","80-speed");
				put("isSpare",true);
			}
		};
		Hashtable<String,Object> tire = new Hashtable<>() {
			{
				put("name","tire");
				put("description","500");
				put("isSpare",true);
			}
		};
		Hashtable<String,Object> tape = new Hashtable<>() {
			{
				put("name","tape");
				put("description","maroon");
				put("isSpare",true);
			}
		};
		Part chainPart = new Part(chain);
		Part tirePart = new Part(tire);
		Part tapePart = new Part(tape);
		
		Parts roadBicycleParts = new Parts(new ArrayList<Part>() {{ add(chainPart); add(tirePart); add(tapePart);}});
		Bicycle roadBicycle = new Bicycle(new Hashtable<String,Object>() {{put("size","48");put("parts",roadBicycleParts);}});
		System.out.println(roadBicycle.spares());
	}
}