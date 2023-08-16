package com.HomeWork;

public class Classinterface implements CI,Di {

	 
		

	@Override
	public void bike() {
		System.out.println("bajaji");
		
	}

	@Override
	public void car() {
		System.out.println("innova");
		
	}
	public static void main(String[] args) {
		 Classinterface j =new Classinterface();
		 j.bike();
		 j.car();
		 j.bicycle();
		 j.electric();
		 
		 
		 
		 
		 
		 
		 
		 
	}

	@Override
	public void electric() {
		System.out.println("ola");
		
	}

	@Override
	public void bicycle() {
		System.out.println("hero");
		
	}
	
	

}
