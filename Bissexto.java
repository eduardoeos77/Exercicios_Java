// 3. Dado um ano com 4 dígitos dizer ser ele é um ano bissexto ou não. 
//(Lembre-se que um ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e não por 100.)

import java.util.Scanner;

class Bissexto {  
  public static void main(String args[]) { 

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um ano com quatro digitos:");
	int ano = entrada.nextInt();
	
	if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
		System.out.println("O ano " + ano + " é bissexto");
	}
	else {
		System.out.println("O ano " + ano + " não é bissexto");
	}
  } 
}