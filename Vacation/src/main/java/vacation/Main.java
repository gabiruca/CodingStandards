// Copyright (C) 2020
// All rights reserved
package vacation;
import java.util.Scanner;


public class Main {

	//CHECKSTYLE: OFF
	/**
     * @param args
     **/
	public static void main(String[] args) {
	//CHECKSTYLE: ON
		final int noAllowed = 80;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vacation Package Cost Estimator");
		System.out.println("Choose your destination (city): ");
		String destination = scanner.nextLine();
		while (destination.isEmpty()) {
			System.out.println("Choose your destination (city): ");
			destination = scanner.nextLine();
		}
		System.out.println("Number of travelers: ");
		String travelers = scanner.nextLine();
		while (travelers.isEmpty()) {
			System.out.println("Number of travelers: ");
			travelers = scanner.nextLine();
		}
		System.out.println("Number of days: ");
		String days = scanner.nextLine();
		while (days.isEmpty()) {
			System.out.println("Number of days: ");
			days = scanner.nextLine();
		}

		if (Integer.valueOf(travelers) > noAllowed) {
			System.out.println("***** The total amount you have to pay is: -1 *****");
			System.out.println("The vacation package is not available for more than 80 people");
		} else {
			CostEstimator estimator;
			estimator = new CostEstimator(destination, Integer.valueOf(travelers), Integer.valueOf(days));
			estimator.setPackCost(estimator.popularSpot());
			estimator.setPackCost(estimator.travelersDiscount());
			estimator.setPackCost(estimator.penaltyFee());
			System.out.println("***** The total amount you have to pay is: "+estimator.getPackCost()+" *****");
		}
		scanner.close();
	}

}
