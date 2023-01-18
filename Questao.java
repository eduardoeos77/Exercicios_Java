/* ADO 4 - 2. Implemente uma questão de múltipla escolha referente a alguma das outras disciplinas que você está cursando neste semestre. Primeiro deverá ser apresentado
o enunciado da questão com as 5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta
deverá ser impresso “Resposta correta”, caso contrário “Resposta incorreta”. Utilize a instrução switch, invés de if, na implementação. */

import java.util.Scanner;

class Questao {  
  public static void main(String args[]) { 

    Scanner entrada = new Scanner(System.in);
	
	System.out.println("Levando em conta o que você aprendeu em Matemática para Tecnologia da Informação, resolva a subtração de polinômios e escolha a alternativa correta.");
	System.out.println("\n");
	System.out.println("(6x^2 + 3x - 9) - (-2x^2 + 4x - 1)");
	System.out.println("\n");
	System.out.println("a -> 6x^2 - 9x + 5 ");
	System.out.println("b -> -4x^2 + 7x");
	System.out.println("c -> -8x^2 + x + 8");
	System.out.println("d -> 4x^2 ");
	System.out.println("e -> 8x^2 - x - 8");
	
	
	char resposta = entrada.next().charAt(0);
	
	switch (resposta) {
		
		case 'a':
			System.out.println("Resposta incorreta");
			break;
		case 'b':
			System.out.println("Resposta incorreta");
			break;
		case 'c':
			System.out.println("Resposta incorreta");
			break;
		case 'd':
			System.out.println("Resposta incorreta");
			break;
		case 'e':
			System.out.println("Resposta correta");
			break;
		default:
			System.out.println("Resposta inválida!");
			break;
	}
  } 
}