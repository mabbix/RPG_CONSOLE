package entities;

import java.util.Scanner;
public final class Accounts {
	
	
	//Players manual add

	Scanner sc = new Scanner(System.in);
	
	public final static String Acc1Name = "Maycon";
	public final static String Acc1Login = "Buzzola";
	public final static String Acc1Pass = "1234";
	
	//public static final String Acc1Name = sc.nextLine();
	//public static final String Acc1Login = sc.nextLine();
	//public static final String Acc1Pass = sc.nextLine();

	
	
	
	public static String getAcc1Login() {
		
		return Acc1Login;
	}
	
	public static String getAcc1Pass() {
		
		return Acc1Pass;
	}
	
	public static String getAcc1Name() {
		
		return Acc1Name;
	}

	
	
}


