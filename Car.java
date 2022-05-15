package week1.day1;

public class Car {

	public void applyBreak()
	{
		System.out.println("Applied Break");
	}
	
	public void applyGear()
	{
		System.out.println("applied Gear");
	}
	public void switchonAc()
	{
		System.out.println("AC on");
	}
	public void applyAcclerate()
	{
		System.out.println("Applied acclerate");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj = new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.switchonAc();
		obj.applyAcclerate();
	}

}
