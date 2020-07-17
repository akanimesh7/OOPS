package Bicycle;

import java.util.Hashtable;

public class Parts {
	private String tireSize;
	private String chain;
	
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
	
	public Parts(Hashtable<String, Object> passParts) {
		setTireSize((String) passParts.get("tireSize") != null ? (String) passParts.get("tireSize") : defaultTireSize());
		setChain((String) passParts.get("chain") != null ? (String) passParts.get("chain") : defaultChain());
		postInitialise(passParts);
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
//		hashParent.put("No Spare Recieved","No Spare Recieved");
		return hashParent;
	}

	public String defaultTireSize() {
		// Can be also initialised to make it compulsory for subclasses to override
		return "23";
	}

	public String defaultChain() {
		return "10-speed";
	}
}
