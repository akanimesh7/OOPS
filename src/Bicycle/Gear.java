package Bicycle;


public class Gear {
	private double chainRing;
	private double cog;
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
		return obj.diameter() * gearRatio();
	}

	public Gear(double chainRing, double cog) {
		setChainRing(chainRing);
		setCog(cog);
	}
	
	public static void main(String[] args) {
		Gear g = new Gear(1,2);
		CircularObject w = new Wheel(3, 4);
		System.out.println((g.gearInches(w)));
	}
}
