package week3.day1;

public class AxisBank extends Bankinfo {

	public void deposit() {
		System.out.println("This is my axis bank deposit");
	}
	
public void getDeposit() {
	this.deposit();
	super.deposit();
}
	public static void main(String[] args) {
		AxisBank info = new AxisBank();
		info.getDeposit();
	}

}

