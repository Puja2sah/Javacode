package j2se.basics.oop.polymorphism;

public class Ncell implements Sim {

	@Override
	public void call() {
		System.out.println("calling using Ncell...");

	}

	@Override
	public void data() {
		System.out.println("Update calling from Ncell!");

	}

}
