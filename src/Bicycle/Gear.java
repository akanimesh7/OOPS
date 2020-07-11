package Bicycle;

public class Gear {
	private double chainRing;
	private double cog;

	public Gear(double chainRing, double cog) {
		this.chainRing = chainRing;
		this.cog = cog;
	}

	double getRatio() {
		return Double.isInfinite(chainRing / cog)?Double.POSITIVE_INFINITY:(chainRing/cog);
	}
}
