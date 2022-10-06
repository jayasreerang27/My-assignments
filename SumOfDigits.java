package week1.day2;

public class SumOfDigits {
 public static void main(String[] args) {
	
	 int i = 123;
	 int  digit, sum =0;;
	for ( sum = 0; i !=0; i= i/10 ) {
		sum= sum+ i%10;
	}
	 
	 System.out.println(sum);
}
}
