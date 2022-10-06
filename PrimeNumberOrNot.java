package week1.day2;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		
		int n = 13;
		boolean isprime = true;
		
		if (n==0|| n==1) {
			System.out.println("Number is not prime");
		}else {
			for (int i =2; i<(n/2); i++) {
				if(n%i==0){
					System.out.println("Number is not prime");
					isprime = false;
					break;
				}
			}
		if (isprime == true) {
			System.out.println("Number is prime");
					}
		}
	}

}
