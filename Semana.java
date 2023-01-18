// ADO 4 - 1. Utilizando a instrução switch escreva um programa que recebe um valor inteiro de 1 a 7 e retorna o correspondente dia da semana. Considere que 1 corresponde a
// domingo, 2 a segunda-feira, ..., 7 a sábado. Além disso, no caso de uma entrada errada, como por exemplo 0, deve ser impresso “Valor inválido!”.

import java.util.Scanner;

class Semana {  
  public static void main(String args[]) { 

    Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um número de 1 a 7:");
	int n = entrada.nextInt();
	
	switch (n) {
		
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Valor inválido!");
			break;
	}
  } 
}