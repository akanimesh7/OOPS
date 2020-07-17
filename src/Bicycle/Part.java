package Bicycle;

import java.util.Hashtable;

public class Part {
	private String name;
	private String description;
	private boolean isSpare = false;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isSpare() {
		return isSpare;
	}
	public void setSpare(boolean isSpare) {
		this.isSpare = isSpare;
	}
	public Part(Hashtable<String,Object> passPart) {
		setName((String)passPart.get("name"));
		setDescription((String)passPart.get("description"));
		setSpare((boolean)passPart.get("isSpare"));
	}
	@Override
	public String toString() {
		return "Part [name=" + name + ", description=" + description + ", isSpare=" + isSpare + "]\n";
	}
	
}
