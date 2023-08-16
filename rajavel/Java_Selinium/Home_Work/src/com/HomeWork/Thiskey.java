
package com.HomeWork;

public class Thiskey {
	int x = 10, y = 20;

	void data() {
		int x = 30, y = 40;

		System.out.println(x);
		System.out.println(y);
		System.out.println(this.x);
		System.out.println(this.x);

	}

	void surf() {
		int x = 50, y = 70;

		System.out.println();
	}

	public static void main(String[] args) {

		Thiskey k = new Thiskey();

		k.data();
		System.out.println(k.y);

	}
}