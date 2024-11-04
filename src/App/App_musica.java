package App;
import java.util.Scanner;
public class App_musica {
	Scanner input = new Scanner(System.in);
	public  void musica() {
		boolean condi = true;
		while (condi) {
		System.out.println("Bem vindo ao Aplicativo de musica");
		System.out.println("Pausar Musica [1]");
		System.out.println("tocar musica [2]");
		System.out.println("Sair [3]");
		int opcao = input.nextInt();
		input.nextLine();
		switch(opcao) {
		case 1:
			pausar();
			break;
		case 2:
			tocar();
			break;
		case 3:
			System.out.println("Saindo.....");
			condi = false;
			break;
		}
		}
	}

	private   void tocar() {
		System.out.println("Escolha uma musica");
		String nome = input.nextLine();

		System.out.println("Tocando musica " + nome);
		
	}
	
	private void  pausar() {
		System.out.println("Pausando musica");
	}
	
	
	
}
