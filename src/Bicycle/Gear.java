package Bicycle;

import java.util.Arrays;

public class Gear {
	private double chainRing; // Getters and setters needed
	private double cog;
	private double rimDiameter;
	private double tyreDiameter;
	final static int DEAFULT = 1;
	final static int RIM = 0;
	final static int TYRE = 1;
	private double wheels[][];
//	Getters and setters
	public double[][] getWheels() {
		return wheels;
	}

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

	public void setWheels(double[][] wheels) {
		this.wheels = wheels;
	}

	public double getRimDiameter() {
		return rimDiameter;
	}
	
	public double getRimDiameter(double wheel[]) {
		return wheel[RIM];
	}

	public void setRimDiameter(double rimDiameter) {
		this.rimDiameter = rimDiameter;
	}

	public double getTyreDiameter() {
		return tyreDiameter;
	}
	
	public double getTyreDiameter(double wheel[]) {
		return wheel[TYRE];
	}

	public void setTyreDiameter(double tyreDiameter) {
		this.tyreDiameter = tyreDiameter;
	}
	
//	Behaviour Functions
	
	private double wheelDiameter(double wheel[]) {
		return  (getRimDiameter(wheel))+ (2 * getTyreDiameter(wheel));
	}
	
	private double wheelDiameter() {
		return getRimDiameter() + 2 * getTyreDiameter();
	}

	private double gearRatio() {
		return Double.isInfinite(getChainRing() / getCog()) ? Double.POSITIVE_INFINITY : (getChainRing() / getCog());
	}

	public double gearInches() {
		return wheelDiameter() * gearRatio();
	}

	private double[] getDiameters() {
		double wheelRef[][] = getWheels();
		int noOfEntries = wheelRef.length;
		double diameters[] = new double[noOfEntries];
		for (int i = 0; i < noOfEntries; i++) {
			diameters[i] = wheelDiameter(wheelRef[i]);
		}
		return diameters;
	}
	
	// Constructor
	public Gear(double[][] wheels) {
		// rearrange input to match your requirements
		// if tyre is first column then swap columns here
		setChainRing(DEAFULT);
		setCog(DEAFULT);
		setRimDiameter(DEAFULT);
		setTyreDiameter(DEAFULT);
		setWheels(wheels);
	}

	public Gear(double chainRing, double cog, double rimDiameter, double tyreDiameter) {
		setChainRing(chainRing);
		setCog(cog);
		setRimDiameter(rimDiameter);
		setTyreDiameter(tyreDiameter);
	}

//	public static void main(String[] args) {
//		double arr[][] = {{1,2},{3,4}};
//		Gear g = new Gear(arr);
//		System.out.println(Arrays.toString(g.getDiameters()));
//	}
}
