package Iphone_Luis;
import App.App_musica;
import App.App_Internet;
import App.App_Telefonico;

import java.util.Scanner;
public class iphone {
	public static void main(String[] args) {
		boolean condi = true;
		while(condi) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo ao iphone...");
		System.out.println("Escolha alguma opção");
		System.out.println("Aplicativo de Musica Digite [1]");
		System.out.println("Aplicativo de Telefônia Digite [2]");
		System.out.println("Acessar a Web Digite [3]");
		System.out.println("Sair [4]");
		int opcao = input.nextInt();
		
		switch (opcao) {
		case 1:
			App_musica app =  new App_musica();
			  app.musica();
			break;
		case 2:
			App_Telefonico tele = new App_Telefonico();
			tele.telefone();
			break;
		case 3:
			App_Internet inter = new App_Internet();
			inter.web();
			break;
		case 4:
			System.out.println("Desligando o Iphone.....");
			condi = false;
			break;
		default:
			System.out.println("Digite uma opção correta");
			break;
		}
		}
	}
}

