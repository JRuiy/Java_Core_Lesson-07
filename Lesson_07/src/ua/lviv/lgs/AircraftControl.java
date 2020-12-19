package ua.lviv.lgs;

public class AircraftControl extends Plane {

	double moveUp() {
		return Math.random()*1000;
	}
	
	double moveDown() {
		return Math.random()*1000;
	}
	
	double moveRight() {
		return Math.random()*1000;
	}
	
	double moveLeft() {
		return Math.random()*1000;
	}

	@Override
	void startingEngines() {
		System.out.println("Двигун запускається за " + 20+Math.random()*68 + " секунд");
		
	}

	@Override
	void takeOfThePlane() {
		System.out.println("Літак проїде на повному баку " + Math.random()*1000 + " кілометрів");
		
	}

	@Override
	void landingOfThePlane() {
		System.out.println("The plane is landing");
		
	}
	
}
