package Bicycle;

import java.util.Dictionary;


public class Wheel implements CircularObject{
	private double rimDiameter;
	private double tyreDiameter;
	final static int DEAFULT = 1;
	final static int RIM = 0;
	final static int TYRE = 1;

	public double getRimDiameter() {
		return rimDiameter;
	}
	
	public Wheel() {
		setRimDiameter(DEAFULT);
		setTyreDiameter(DEAFULT);
	}

	public Wheel(double rimDiameter, double tyreDiameter) {
		setRimDiameter(rimDiameter);
		setTyreDiameter(tyreDiameter);
	}
	
	public Wheel(Dictionary<String,Integer> passWheel) {
		setRimDiameter(passWheel.get("rimDiameter") != null ? passWheel.get("rimDiameter") : DEAFULT);
		setTyreDiameter(passWheel.get("tyreDiameter") != null? passWheel.get("tyreDiameter"): DEAFULT);
	}

//	public double getRimDiameter(double wheel[]) {
//		return wheel[RIM];
//	}

	public void setRimDiameter(double rimDiameter) {
		this.rimDiameter = rimDiameter;
	}

	public double getTyreDiameter() {
		return tyreDiameter;
	}

//	public double getTyreDiameter(double wheel[]) {
//		return wheel[TYRE];
//	}

	public void setTyreDiameter(double tyreDiameter) {
		this.tyreDiameter = tyreDiameter;
	}

	public double diameter() {
		return (getRimDiameter()) + (2 * getTyreDiameter());
	}

	private double getCircumference() {
		return Math.PI * diameter();
	}

}


//private double wheels[][];

//public Wheel(double[][] wheels) {
//	setWheels(wheels);
//}
//
//public double[][] getWheels() {
//	return wheels;
//}
//
//public void setWheels(double[][] wheels) {
//	this.wheels = wheels;
//}

//private double[] getCircumferences() {
//double wheelRef[][] = getWheels();
//int noOfEntries = wheelRef.length;
//double circumferences[] = new double[noOfEntries];
//for(int i=0;i<noOfEntries;i++) {
//	circumferences[i] = Math.PI * wheelDiameter(wheelRef[i]);
//}
//return circumferences;
//}

//private double wheelDiameter() {
//return getRimDiameter() + 2 * getTyreDiameter();
//}

//private double[] getDiameters() {
//double wheelRef[][] = getWheels();
//int noOfEntries = wheelRef.length;
//double diameters[] = new double[noOfEntries];
//for (int i = 0; i < noOfEntries; i++) {
//	diameters[i] = wheelDiameter(wheelRef[i]);
//}
//return diameters;
//}
