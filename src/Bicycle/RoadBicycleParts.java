package Bicycle;

import java.util.Hashtable;

public class RoadBicycleParts extends Parts {
	private String tapeColour;

	public String getTapeColour() {
		return tapeColour;
	}

	public void setTapeColour(String tapeColour) {
		this.tapeColour = tapeColour;
	}

	public RoadBicycleParts(Hashtable<String,Object> passRoadBicycleParts) {
		super(passRoadBicycleParts);
	}
	public void postInitialise(Hashtable<String,Object> passRoadBicycleParts) {
		setTapeColour((String)passRoadBicycleParts.get("tapeColour") != null ? 
				(String)passRoadBicycleParts.get("tapeColour") : defaultTapeColour());
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
