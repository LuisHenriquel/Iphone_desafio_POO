package App;
import java.util.Scanner;
public class App_Telefonico {
Scanner input = new Scanner(System.in);
	public void telefone() {
		boolean condi = true;
		while(condi) {
		System.out.println("Bem vindo ao Aplicativo de Telefone");
		System.out.println("Ligar  [1]");
		System.out.println("Correio de Voz [2]");
		System.out.println("Sair [3]");
		int opcao = input.nextInt();
		input.nextLine();
		switch(opcao) {
		case 1:
			ligar();
			break;
		case 2:
			iniciarCorreioVoz();
			break;
		case 3:
			System.out.println("Saindo");
			condi = false;
			break;
		}
		}
	}
	
	
	private void ligar() {
		System.out.println("Digite o numero que queira ligar");
		String numero = input.nextLine();
		System.out.println("Ligando para o numero:  " + numero);
	}
	private void iniciarCorreioVoz() {
		System.out.println("Iniciando o Correio de voz");
	}
}
