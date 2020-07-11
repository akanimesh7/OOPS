package Bicycle;

public class Gear {
	private double chainRing;
	private double cog;
	private double rimDiameter;
	private double tyreDiameter;

	public Gear(double chainRing, double cog,double rimDiameter, double tyreDiameter) {
		this.chainRing = chainRing;
		this.cog = cog;
		this.rimDiameter = rimDiameter;
		this.tyreDiameter = tyreDiameter;
	}
	private double wheelDiameter() {
		return rimDiameter + 2*tyreDiameter;
	}

	private double gearRatio() {
		return Double.isInfinite(chainRing / cog) ? Double.POSITIVE_INFINITY : (chainRing / cog);
	}
	
	public double gearInches() {
		return wheelDiameter()*gearRatio();
	}
	
//	public static void main(String[] args) {
//		Gear g = new Gear(1,2,3,4);
//		System.out.println(g.gearInches());
//	}
}
