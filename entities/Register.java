package entities;

import java.util.Scanner;

import entities.Accounts;


public class Register {

	public String Login;
	public String Password;
	public Boolean Register;

	
	
	
	
	
		void register() {
			
			Scanner sc = new Scanner(System.in);
			Register.this.Login = sc.nextLine();
			Register.this.Password = sc.nextLine();
			sc.close();
			
			
			
			if((Accounts.Acc1Login == null) && (Accounts.Acc1Login.length() > 4)) {
			
				System.out.println("(Disponível)");
					
				
				
			}
		}
}
