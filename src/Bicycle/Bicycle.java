package Bicycle;

import java.util.Hashtable;
//import java.util.Properties; 

public class Bicycle {
	private String tapeColour;
	private double size;

	public String getTapeColour() {
		return tapeColour;
	}

	public void setTapeColour(String tapeColour) {
		this.tapeColour = tapeColour;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	public Bicycle(Hashtable<String,Object> passBicycle) {
		setTapeColour((String)passBicycle.get("tapeColour"));
		setSize((double)passBicycle.get("size"));
	}
	
	public Hashtable<String,Object> spares(){
		Hashtable<String,Object> returnHash= new Hashtable<String,Object>();
		returnHash.put("chain", "10-speed");
		returnHash.put("tireSize", "23");
		returnHash.put("tapeColour", getTapeColour());
		return returnHash;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Hashtable<String, Object> passBicycle = new Hashtable<>() {
//			{
//				put("tapeColour","green");
//				put("size",20.0D);
//			}
//		};
//		Bicycle b = new Bicycle(passBicycle);
//		System.out.println(b.spares());
//		System.out.println(System.getProperty("user.dir"));
//	}

}
