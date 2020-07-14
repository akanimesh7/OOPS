package Bicycle;

import java.util.Hashtable;
//import java.util.Properties; 

public class Bicycle {
	private String tapeColour;
	private double size;
	private String style;
	private String frontShock;
	private String rearShock;

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getFrontShock() {
		return frontShock;
	}

	public void setFrontShock(String frontShock) {
		this.frontShock = frontShock;
	}

	public String getRearShock() {
		return rearShock;
	}

	public void setRearShock(String rearShock) {
		this.rearShock = rearShock;
	}

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
		setStyle((String)passBicycle.get("style"));
		setRearShock((String)passBicycle.get("rearShock"));
		setFrontShock((String)passBicycle.get("frontShock"));
	}
	
	public Hashtable<String,Object> spares(){
		Hashtable<String,Object> returnHash= new Hashtable<String,Object>();
		if(getStyle() == "road") {
			returnHash.put("chain", "10-speed");
			returnHash.put("tireSize", "23");
			returnHash.put("tapeColour", getTapeColour());
		}else if(getStyle() == "mountain") {
			returnHash.put("chain", "10-speed");
			returnHash.put("tireSize", "2.3");
			returnHash.put("rearShock",getRearShock());
		}
		return returnHash;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Hashtable<String, Object> passBicycle = new Hashtable<>() {
//			{
//				put("style","mountain");
//				put("rearShock","Fox");
//				put("size",20.0D);
//			}
//		};
//		Bicycle b = new Bicycle(passBicycle);
//		System.out.println(b.spares());
////		System.out.println(System.getProperty("user.dir"));
//	}

}
