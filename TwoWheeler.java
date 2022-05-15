package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 74658;
	boolean isPunctured = false;
	String bikeName= "Yamaha";
	double runningKM= 4566.34;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


TwoWheeler obj = new TwoWheeler();
System.out.println("noOfWheels="+obj.noOfWheels);
System.out.println("no of mirrors ="+ obj.noOfMirrors);
System.out.println("chassisnumber ="+obj.chassisNumber);
System.out.println("ispunctured ="+obj.isPunctured);
System.out.println("bikename ="+obj.bikeName);
System.out.println("Km ="+obj.runningKM);

	}

}
