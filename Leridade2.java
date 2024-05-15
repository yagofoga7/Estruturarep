package Estruturaposcondicional;

import java.util.Scanner;

public class Leridade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 1, idade, soma = 0;

		while(i <= 20) {
			i++;
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
			if (idade > 18) ; 
		
			soma++;
			}

		
		System.out.println(soma+ " São maiores de idade");
		ler.close();

	}

}
