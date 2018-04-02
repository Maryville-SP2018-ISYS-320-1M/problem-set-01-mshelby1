/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/1/2018
*/

public class P9_ATMDispenser {

	public static void main(String[] args) {
		int $10 = 10;
		int Withdraw = 324;
		
		System.out.println("Dispense " + (Withdraw / $10) + " $10 bills");
		System.out.println("Dispense " + (Withdraw % $10) + " $1 bills");
	}

}

