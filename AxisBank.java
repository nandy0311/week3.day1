package week3.day1;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Override from BankInfo-Deposit at axis bank");
}
public static void main(String[] args) {
	AxisBank obj = new  AxisBank();
	obj.saving();
	obj.fixed();
	obj.deposit();
	
}
}
