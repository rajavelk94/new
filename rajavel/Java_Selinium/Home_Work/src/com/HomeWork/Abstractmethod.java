package com.HomeWork;

public abstract class Abstractmethod {

	public abstract void car();

	public void bike() {

		System.out.println("honda shine");
	}

	public static void main(String[] args) {

		Abstractmethod m = new Abstractmethod() {

			@Override
			public void car() {

				System.out.println("bmw");
				
			}

		};
		m.bike();
         m.car();
	}

}
