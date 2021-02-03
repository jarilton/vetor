package aplication;

import java.util.Scanner;

import entities.Clientes;

public class Pensionato {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Clientes[] vect = new Clientes[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Clientes #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Clientes(nome, email);
		
		}
		
		System.out.println();
		System.out.println("Quartos Ocupados: ");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ":" + vect [i]);
			}
		}
		
		
		sc.close();

	}

}
