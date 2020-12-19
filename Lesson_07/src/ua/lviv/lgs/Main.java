package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		
		Cy_26 cy = new Cy_26(500, "black");
		
		cy.startingEngines();
		cy.takeOfThePlane();
		System.out.println("Літак летить вгору на " + cy.moveUp() + " кілометрів");
		System.out.println("Літак летить ліворуч на " + cy.moveLeft() + " кілометрів");
		System.out.println("Літак летить вниз на " + cy.moveDown() + " кілометрів");
		System.out.println("Літак летить праворуч на " + cy.moveRight() + " кілометрів");
		cy.stealthTechnology();
		cy.nuclearStrike();
		cy.turboAcceleration();
		cy.landingOfThePlane();

	}

}
