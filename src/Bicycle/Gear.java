package Bicycle;

import java.util.Dictionary;
import java.util.Hashtable;

public class Gear {
	private double chainRing;
	private double cog;
	private static int DEFAULT=1;
//	Getters and setters

	public double getChainRing() {
		return chainRing;
	}

	public void setChainRing(double chainRing) {
		this.chainRing = chainRing;
	}

	public double getCog() {
		return cog;
	}

	public void setCog(double cog) {
		this.cog = cog;
	}

//	Behaviour Functions

	private double gearRatio() {
		return Double.isInfinite(getChainRing() / getCog()) ? Double.POSITIVE_INFINITY : (getChainRing() / getCog());
	}

	public double gearInches(CircularObject obj) {
		double diameterObject = diameter(obj);
		return diameterObject * gearRatio();
	}
	private double diameter(CircularObject obj) {
		return obj.diameter();
	}

	public Gear(double chainRing, double cog) {
		setChainRing(chainRing);
		setCog(cog);
	}
	
	public Gear(Dictionary<String,Double> passGear) {
		setChainRing(passGear.get("chainRing")!=null ? passGear.get("chainRing") : DEFAULT );
		setCog(passGear.get("cog") != null ? passGear.get("cog") : DEFAULT);
	}
	
	public static void main(String[] args) {
		Dictionary<String, Double> passGear = new Hashtable(); 
		passGear.put("cog", 2.0);
		passGear.put("chainRing", 1.0);
		Gear gear = new Gear(passGear);
		Dictionary<String, Double> passWheel = new Hashtable<>() {
			{
				put("rimDiameter", 3.0);
				put("tyreDiameter", 4.0);
			}
		};
		CircularObject wheel = new Wheel(passWheel);
		System.out.println((gear.gearInches(wheel)));
	}
}
