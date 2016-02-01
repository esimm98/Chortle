import java.io.*;
import java.util.Scanner;

class Car {
	double startMiles;
	double endMiles;
	double gallons;

	Car(double first) {
		startMiles = first;
	}

	void fillUp(double miles, double gals) {
		endMiles = miles;
		gallons = gals;
	}

	double calculateMPG() {
		return (endMiles - startMiles) / gallons;
	}

	boolean gasHog() {
		if (calculateMPG() < 15.0) {
			return true;
		}
		return false;
	}

	boolean economyCar() {
		if (calculateMPG() > 30.0) {
			return true;
		}
		return false;
	}
}

class MPG {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double startMiles, endMiles, gallons;

		System.out.print("New odometer reading: ");
		startMiles = input.nextDouble();

		Car car = new Car(startMiles);

		System.out.println("Filling Station Visit ");
		System.out.print("Odometer reading: ");
		endMiles = input.nextDouble();
		System.out.print("Gas filled up: ");
		gallons = input.nextDouble();

		car.fillUp(endMiles, gallons);
		System.out.println("MPG: " + car.calculateMPG());

		if (car.gasHog()) {
			System.out.println("What a gas hog.");
		}
		if (car.economyCar()) {
			System.out.println("Woah, an efficient car.");
		}
	}
}