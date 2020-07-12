package Bicycle;

import java.util.Arrays;

public class Gear {
	private double chainRing; // Getters and setters needed
	private double cog;
	private double rimDiameter;
	private double tyreDiameter;
	final static int RIM = 0;
	final static int TYRE = 1;
	private double wheels[][];

	public double[][] getWheels() {
		return wheels;
	}

	public void setWheels(double[][] wheels) {
		this.wheels = wheels;
	}

	private double[] getDiameters() {
		double wheelRef[][] = getWheels();
		int noOfEntries = wheelRef.length;
		double diameters[] = new double[noOfEntries];
		for (int i = 0; i < noOfEntries; i++) {
			diameters[i] = wheelRef[i][RIM] + (wheelRef[i][TYRE] * 2);
		}
		return diameters;
	}

	public Gear(double[][] wheels) {
		// rearrange input to match your requirements
		// if tyre is first column then swap columns here
		this.wheels = wheels;
	}

	public Gear(double chainRing, double cog, double rimDiameter, double tyreDiameter) {
		this.chainRing = chainRing;
		this.cog = cog;
		this.rimDiameter = rimDiameter;
		this.tyreDiameter = tyreDiameter;
	}

	private double wheelDiameter() {
		return rimDiameter + 2 * tyreDiameter;
	}

	private double gearRatio() {
		return Double.isInfinite(chainRing / cog) ? Double.POSITIVE_INFINITY : (chainRing / cog);
	}

	public double gearInches() {
		return wheelDiameter() * gearRatio();
	}

//	public static void main(String[] args) {
//		double arr[][] = {{1,2},{3,4}};
//		Gear g = new Gear(arr);
//		System.out.println(Arrays.toString(g.getDiameters()));
//	}
}
