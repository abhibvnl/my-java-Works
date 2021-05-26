package com;

public  class Driver extends Car {
	@Override
	void start() {
		System.out.println("car styarted");
	}
@Override
void Shift() {
	System.out.println("shifting");
}
public static void main(String[] args) {
	Driver d=new Driver();
	d.start();
	d.Shift();
}
}
