package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors = 3;
	long chassisNumber = 4256;
	boolean isPunctured = false;
	String bikeName = "Pulsar";
	double runningKM =23568955;
	
	
		public static void main(String[] args) {
		
			TwoWheeler obj = new TwoWheeler();
			
			System.out.println(obj.noOfWheels);
			System.out.println(obj.noOfMirrors);
			System.out.println(obj.chassisNumber);
			System.out.println(obj.isPunctured);
			System.out.println(obj.bikeName);
			System.out.println(obj.runningKM);
			
	}

	
}
