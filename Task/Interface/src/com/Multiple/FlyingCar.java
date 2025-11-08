package com.Multiple;

public class FlyingCar implements Drivable,Flyable{

	@Override
	public void Fly() {
		
		System.out.println("Fliess");
	}

	@Override
	public void Start() {
		System.out.println("Starts...");
		
	}

	@Override
	public void Stop() {
		System.out.println("Stops...");
	}
public static void main(String[] args) {
	Drivable d = new FlyingCar();
	Flyable f = new FlyingCar();
	d.Start();
	d.Stop();
	f.Fly();
}
}
