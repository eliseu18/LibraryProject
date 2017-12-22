package ifrn.poo.project.library.main;

import java.util.ArrayList;
import java.util.Scanner;

import ifrn.poo.project.library.system.Category;
import ifrn.poo.project.library.system.Library;
import ifrn.poo.project.library.system.LibraryImplementation;
import ifrn.poo.project.library.system.Collection;

public class main {

	public static void main(String[] args) {
		Library lib = new LibraryImplementation();
		int option = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma operação a ser realizada!");
		System.out.println("1 - Cadastrar livros a partir de arquivo.\n"
				+ "			2 - Cadastrar um livro.\n"
				+ "			3 - Consultar categorias. \n"
				+ "			4 - Consultar Acervo. \n"
				+ "			5 - Consultar Livros. \n"
				+ "			6 - Consultar Audios. \n"
				+ "			7 - Consultar Filmes. \n"
				+ "			0 - Sair \n");
		
		do {
			option = sc.nextInt();
			switch (option) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default:
				break;
			}
		}while(option != 0);
		
	}

	private void consultarCategorias(Library lib) {
		int option = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Category> cat = lib.getCategories();
		
		System.out.println("O que você deseja fazer? \n"
				+ "			1 - Mostrar todas as categorias.\n"
				+ "			2 - Mostrar todos o acervo de uma categoria. \n"
				+ "			3 - Procurar uma acervo em uma categoria. \n"
				+ "			0 - Voltar. \n");
		do {
			option = sc.nextInt();
			switch(option) {
			case 1:				
				for(int i = 0; i < cat.size(); i++) {
					System.out.println((i+1) + " " + cat.get(i));
				}
				break;
			case 2: 
				break;
			case 3:
				break;
			case 0:
				break;
			default:
				break;
			}
		}while(option != 0);
	}
}
