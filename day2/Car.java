package day2;

public class Car {

	public void applyBreak() {
		System.out.println("Push the break");
	}
public void applyGear() {
		System.out.println("Change the Gear");
	}
public void switchOnAc() {
	System.out.println("switch on the AC");
}
public void applyAcclerate() {
	System.out.println("Push the Acclerator");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Car obj = new Car();
   obj.applyBreak();
   obj.applyGear();
   obj.switchOnAc();
   obj.applyAcclerate();
	}

}
