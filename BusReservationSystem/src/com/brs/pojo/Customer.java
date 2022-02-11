package com.brs.pojo;

public class Customer {
	private Bus bookedBus;

	public Customer(Bus bookedBus) {
		
		this.bookedBus = bookedBus;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus getBookedBus() {
		return bookedBus;
	}

	public void setBookedBus(Bus bookedBus) {
		this.bookedBus = bookedBus;
	}

	@Override
	public String toString() {
		return "Customer [bookedBus=" + bookedBus + "]";
	}
	

}
