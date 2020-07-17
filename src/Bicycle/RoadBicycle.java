package Bicycle;

import java.util.Hashtable;

public class RoadBicycle extends Bicycle {
	private String tapeColour;

	public String getTapeColour() {
		return tapeColour;
	}

	public void setTapeColour(String tapeColour) {
		this.tapeColour = tapeColour;
	}

	public RoadBicycle(Hashtable<String,Object> passRoadBicycle) {
		super(passRoadBicycle);
	}
	public void postInitialise(Hashtable<String,Object> passRoadBicycle) {
		setTapeColour((String)passRoadBicycle.get("tapeColour") != null ? 
				(String)passRoadBicycle.get("tapeColour") : defaultTapeColour());
	}
	
	public Hashtable<String, Object> extraSpares() {
		Hashtable<String, Object> returnHash = new Hashtable<String, Object>(){
			{
				put("tapeColour",getTapeColour());
			}
		};
		return returnHash;
	}

	private String defaultTapeColour() {
		return "green";
	}

	public Hashtable<String, Object> spares() {
		return super.spares();
	}
}
