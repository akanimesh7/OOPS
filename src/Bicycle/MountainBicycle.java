package Bicycle;

import java.util.Hashtable;

public class MountainBicycle extends Bicycle {
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
	
	public MountainBicycle(Hashtable<String,Object> passMountainBicycle) {
		super(passMountainBicycle);
	}
	
	public void postInitialise(Hashtable<String,Object> passMountainBicycle) {
		setRearShock((String)passMountainBicycle.get("rearShock") != null ? (String)passMountainBicycle.get("rearShock") : defaultRearShock());
		setFrontShock((String)passMountainBicycle.get("frontShock") != null ? (String)passMountainBicycle.get("frontShock") : defaultFrontShock());
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
