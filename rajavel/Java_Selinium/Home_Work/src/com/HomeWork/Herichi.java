package com.HomeWork;

public class Herichi {

	 public void car() {
		System.out.println("innova");

	}

}

class herichi1 extends Herichi {
	void bike() {

		System.out.println("pulsar");
		
}
public void car() {
	// TODO Auto-generated method stub

}
}

class herichi2 extends Herichi {

	void cycle() {
		System.out.println("cycle is best");
	}

	public static void main(String[] args) {

		herichi2 m = new herichi2();
		herichi1 n = new herichi1();

		n.bike();
		n.car();

		m.cycle();
		m.car();
		
		

	}

}
