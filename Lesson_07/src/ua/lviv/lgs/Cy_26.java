package ua.lviv.lgs;

public class Cy_26 extends AircraftControl implements SpecialOpportunities {

	double maxSpeed;
	String color;
	
	public Cy_26(double maxSpeed, String color) {
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void turboAcceleration() {
		System.out.println(Math.random()*(1000 - this.maxSpeed) + this.maxSpeed + " км/год");
	}

	@Override
	public void stealthTechnology() {
		System.out.println("Літак буде не видно протягом " + Math.random()*20 + " cекунд");
	}

	@Override
	public void nuclearStrike() {
		System.out.println("Було скинуто " + (int)Math.random()*((10-1)+1)+1);
	}

}
