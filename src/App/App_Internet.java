package App;
import java.util.Scanner;
public class App_Internet {
	Scanner scan = new Scanner(System.in);
	
	public void web() {
		boolean condi = true;
		while (condi) {
		System.out.println("Bem vindo a Web");
		System.out.println("exibir Pagina [1]");
		System.out.println("adicionarNovaAba [2]");
		System.out.println("atualizarPagina [3]");
		System.out.println("Sair [4]");

		int opcao = scan.nextInt();
		switch(opcao) {
		case 1:
			exibirPagina();
			break;
		case 2:
			adicionarNovaAba();
			break;
		case 3:
			atualizarPagina();
			break;
		case 4:
			System.out.println("Saindo......");
			condi = false;
			break;
		}
		}
	}
	private void exibirPagina() {
		System.out.println("Digite o url da sua pagina");
		String pagina = scan.next();
		
		System.out.println("Exibindo A pagina " + pagina);
	}
	private void adicionarNovaAba() {
		System.out.println("Abrindo outra aba");
	}
	
	private void atualizarPagina() {
		System.out.println("Atualizando Pagina.....");
	}
	
}
	


	

