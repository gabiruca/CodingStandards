// Copyright (C) 2020
// All rights reserved
package vacation;

public class CostEstimator {
	/**
     * variable destination.
     **/
	private String destination;
	/**
     * variable travelers.
     **/
	private int travelers;
	/**
     * variable vacDays.
     **/
	private int vacDays;
	/**
     * variable packCost.
     **/
	private double packCost;
	/**
     * variable add
     **/
	private double addOns;
	final int oneNumb = 1;
	final int twoNumb = 2;
	final int threeNumb = 3;
	final int tenNumb = 10;
	final int sevenNumb = 7;

	/**
	 * ...
	 * @param dest
	 * @param traveler
	 * @param vacDay
	 */
	public CostEstimator(String destin, int traveler, int vacDay, int addon) {
		super();
		this.destination = destin;
		this.travelers = traveler;
		this.vacDays = vacDay;
		this.packCost = 1000;
		this.addOns = addon;
	}

	/**
     * popular spot.
     **/
	public double popularSpot() {
		double tempor;
		if (destination.equals("Paris")) {
			tempor = packCost+500;
		} else if (destination.equals("New York City")) {
			tempor = packCost+600;
		} else {
			tempor = packCost;
		}
		return tempor;
	}

	/**
     * Discount.
     **/
	public double travelersDiscount() {
		double discount;
		double total;
		if (travelers > 4 && travelers < tenNumb) {
			discount=packCost*0.10;
			total =  packCost-discount;
		} else if (travelers > tenNumb) {
			discount=packCost*0.20;
			total = packCost - discount;
		} else {
			total = packCost;
		}
		return total;
	}

	/**
     * Penalty.
     **/
	public double penaltyFee() {
		double total;
		if (vacDays<sevenNumb) {
			total = packCost+200;
		} else if (vacDays>30 || vacDays==2) {
			total = packCost-200;
		} else {
			total = packCost;
		}
		return total;
	}

	public double addons() {
		double addons;
		if(addOns==oneNumb) {
			addons = packCost+(200*travelers);
		}else if(addOns==twoNumb) {
			addons = packCost+(150*travelers);
		}else if(addOns==threeNumb) {
			addons = packCost+(100*travelers);
		}else {
			addons = packCost;
		}
		return addons;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTravelers() {
		return travelers;
	}

	public void setTravelers(int travelers) {
		this.travelers = travelers;
	}

	public int getVacDays() {
		return vacDays;
	}

	public void setVacDays(int vacDays) {
		this.vacDays = vacDays;
	}

	public double getPackCost() {
		return packCost;
	}

	public void setPackCost(double packCost) {
		this.packCost = packCost;
	}
	
}
