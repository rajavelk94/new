package com.HomeWork;

public class Abstract1 extends Abstractmethod {

	@Override
	public void car() {
		System.out.println(" i want to buy  maruthi suzuki eritica");

	}

	private void more() {
		System.out.println(" i want to eat more");
	}

	public static void main(String[] args) {

		Abstract1 b = new Abstract1();

		b.bike();
		b.car();
		b.more();
	}

}
