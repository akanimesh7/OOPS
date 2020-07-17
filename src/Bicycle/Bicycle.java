package Bicycle;

import java.util.Hashtable;
//import java.util.Properties; 

public class Bicycle {
	private String size;
	private String tireSize;
	private String chain;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTireSize() {
		return tireSize;
	}

	public void setTireSize(String tireSize) {
		this.tireSize = tireSize;
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public Bicycle(Hashtable<String, Object> passBicycle) {
		setSize((String) passBicycle.get("size")); // Assuming size will always be provided
		setTireSize((String) passBicycle.get("tireSize") != null ? (String) passBicycle.get("tireSize")
				: defaultTireSize());
		setChain((String) passBicycle.get("chain") != null ? (String) passBicycle.get("chain") : defaultChain());
		postInitialise(passBicycle);
	}

	public Hashtable<String, Object> spares() {
		Hashtable<String, Object> returnHash = new Hashtable<String, Object>();
		returnHash.put("chain", getChain());
		returnHash.put("tireSize", getTireSize());
		returnHash.putAll(extraSpares());
		return returnHash;
	}
	
	public void postInitialise(Hashtable<String, Object> passBicycle) {}
	
	public Hashtable<String, Object> extraSpares() {
		Hashtable<String, Object> hashParent = new Hashtable<String, Object>();
		hashParent.put("No Spare Recieved","No Spare Recieved");
		return hashParent;
	}

	public String defaultTireSize() {
		return "23";
	}

	public String defaultChain() {
		return "10-speed";
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Hashtable<String, Object> passRoadBicycle = new Hashtable<>() {
			{
				put("size", "20.0");
			}
		};
		RoadBicycle br = new RoadBicycle(passRoadBicycle);
		System.out.println(br.spares());

		Hashtable<String, Object> passMountainBicycle = new Hashtable<>() {
			{
				put("size", "20.0");
			}
		};
		MountainBicycle bm = new MountainBicycle(passMountainBicycle);
		System.out.println(bm.spares());

	}
}