package com.HomeWork;

class bike {

	void hero() {
		System.out.println("model is splender+");

	}

	void bajaji() {

		System.out.println("modei is pulsar");
	}
}

class Electric extends bike {

	void ola() {
		System.out.println(" ola is electric vehicle");

	}

	void oztech() {
		System.out.println("oztech is a electric vehicle");

	}
}

class bicycle extends Electric{
	
 public void herocycle() {
 
	 System.out.println("hero cycle is best");
}
	}



public class Car extends bicycle{

	void maruthi() {

		System.out.println("model is eritica");

	}

	void honda() {
		System.out.println("model is honda city");
	}

	public static void main(String[] args) {
		Car q = new Car();

		q.bajaji();
		q.hero();
		q.honda();
		q.maruthi();
		q.ola();
		q.oztech();
		q.herocycle();

	}

}
