package Bicycle;

import java.util.Hashtable;

public class MountainBicycleParts extends Parts {
	private String rearShock;
	private String frontShock;
	
	public String getRearShock() {
		return rearShock;
	}
	public void setRearShock(String rearShock) {
		this.rearShock = rearShock;
	}
	public String getFrontShock() {
		return frontShock;
	}
	public void setFrontShock(String frontShock) {
		this.frontShock = frontShock;
	}
	
	public MountainBicycleParts(Hashtable<String,Object> passMountainBicycleParts) {
		super(passMountainBicycleParts);
	}
	
	public void postInitialise(Hashtable<String,Object> passMountainBicycleParts) {
		setRearShock((String)passMountainBicycleParts.get("rearShock") != null ? (String)passMountainBicycleParts.get("rearShock") : defaultRearShock());
		setFrontShock((String)passMountainBicycleParts.get("frontShock") != null ? (String)passMountainBicycleParts.get("frontShock") : defaultFrontShock());
	}
	
	public Hashtable<String, Object> extraSpares() {
		Hashtable<String, Object> returnHash = new Hashtable<String, Object>(){
			{
				put("rearShock",getRearShock());
			}
		};
		return returnHash;
	}
	
	private String defaultRearShock() {
		return "FoxRear";
	}
	
	private String defaultFrontShock() {
		return "Fox";
	}
	
	//overrriding default tireSize
	
	public String defaultTireSize() {
		return "30";
	}
	
	public Hashtable<String,Object> spares() {
		return super.spares();
	}
	
	

}
