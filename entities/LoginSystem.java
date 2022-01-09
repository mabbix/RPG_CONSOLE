package entities;

import java.util.Scanner;

public class LoginSystem {

	public String LoginBox;
	public String PasswordBox;
	public Boolean LoginSucess = false;
	public Boolean LoginFailed = false;

	Scanner sc = new Scanner(System.in);

	public String loginSystem() {

		LoginBox = sc.nextLine();

		if (LoginBox == Accounts.getAcc1Login()) {
			System.out.println("Login Encontrado, digite sua senha.");
			PasswordBox = sc.nextLine();
		} else if (LoginBox != Accounts.getAcc1Login()) {
			System.out.println("Login Não Encontrado, tente novamente.");
			LoginBox = sc.nextLine();
			
		} else if ((PasswordBox == Accounts.getAcc1Pass()) && (LoginBox == Accounts.getAcc1Pass())) {
			LoginSucess = true;
		} else if (PasswordBox != Accounts.getAcc1Pass()) {
			System.out.println("Senha incorreta, digite sua senha novamente.");
			PasswordBox = sc.nextLine();

		}
		sc.close();

	}

}
