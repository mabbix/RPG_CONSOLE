import entities.Settings;

import entities.LoginSystem;
import java.util.Scanner;
public class Game {

	public Game() {

	}

	public static void main(String[] args) {

		
		Settings settings = new Settings();

		System.out.println("		    Bem vindo ao " + settings.ServerName);
		System.out.println("=============================================================");
		System.out.println("");
		System.out.println("Informações sobre o GAME:");
		System.out.println("-------------------------------");
		System.out.println("Versão atual: " + settings.ServerVersion);
		System.out.println("Taxa de EXP atual: " + settings.ExpRate);
		System.out.printf("Double Exp atualmente esta: "); settings.settings();
		System.out.println("");
		
		
		//System.out.println("1-Crie Sua Conta ");
		System.out.println("1-Faça login ");
		
		Scanner sc = new Scanner(System.in);
		Integer ToLogin = sc.nextInt();

		
		if (ToLogin == 1) {
			
			LoginSystem loginSystem = new LoginSystem();
			
			LoginSystem();
			
		} sc.close();
		

		
		
		
		
		
		
	
	}

}

