package Oops;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("deposit the money in bank");
	}
	public static void main(String[] args) {
		BankInfo bank=new AxisBank();
		bank.saving();
		bank.deposit();
		bank.fixed();
	}

}
	
