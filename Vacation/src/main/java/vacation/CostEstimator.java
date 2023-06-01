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
	 * ...
	 * @param dest
	 * @param traveler
	 * @param vacDay
	 */
	public CostEstimator(String dest, int traveler, int vacDay) {
		super();
		this.destination = dest;
		this.travelers = traveler;
		this.vacDays = vacDay;
		this.packCost = 1000;
	}

	/**
     * popular spot.
     **/
	public double popularSpot() {
		double temp;
		if (destination.equals("Paris")) {
			temp = packCost+500;
		} else if (destination.equals("New York City")) {
			temp = packCost+600;
		} else {
			temp = packCost;
		}
		return temp;
	}

	/**
     * Discount.
     **/
	public double travelersDiscount() {
		double discount;
		double total;
		if (travelers>4 && travelers<10) {
			discount=packCost*0.10;
			total =  packCost-discount;
		} else if(travelers>10){
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
		if (vacDays<7) {
			total = packCost+200;
		} else if (vacDays>30 || vacDays==2) {
			total = packCost-200;
		} else {
			total = packCost;
		}
		return total;
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
