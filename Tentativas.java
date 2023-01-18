/* ADO 6 – Implemente o código descrito abaixo, no IDE Eclipse
Utilize a instrução switch e o laço/loop do-while para implementar uma
questão de múltipla escolha referente a alguma das outras disciplinas que você
está cursando neste semestre. Primeiro deverá ser apresentado o enunciado da
questão com as 5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e).
Depois que o usuário escolher uma opção, se for a resposta correta deverá ser
impresso “Resposta correta”, caso contrário “Resposta incorreta”. No caso de
“Resposta incorreta” a questão deve ser apresentada novamente para outra
tentativa. Deve ser permitido no máximo 3 tentativas, quando a resposta
correta for escolhida deve ser informado em qual tentativa isso ocorreu, caso
isso não ocorra em nenhuma das 3 tentativas deve ser impresso “Resposta
incorreta nas 3 tentativas”.
 */
 
import java.util.Scanner;

class Tentativas {  
  public static void main(String args[]) {

    Scanner entrada = new Scanner(System.in);
    char escolha;
	int numTentativas = 1;
	boolean respostaCorreta = false;
	

  System.out.println("\nDe acordo com o que você estudou em classe, responda a questão seguinte. Você tem três tentativas.\n");
    
    do {
        System.out.println("Quem foi responsável por desenvolver o modelo de administração conhecido como Administração Científica ou TAYLORismo?\n");
        System.out.println("a - Eu.");
        System.out.println("b - Você.");
        System.out.println("c - O seu Zé da venda da esquina.");
        System.out.println("d - Frederick Winslow TAYLOR.");
		System.out.println("e - Seu bichinho de estimação em um dia repleto de raios de sol e inspiração.\n");
    
        escolha = entrada.next().charAt(0);

        switch(escolha) {
            case 'd': case 'D':
                System.out.println("\nResposta correta na tentativa: " + numTentativas);
				respostaCorreta = true;
                break;
            case 'a': case 'A': case 'b': case 'B': case 'c': case 'C': case 'e': case 'E':
				if (numTentativas < 3){
					System.out.println("\nResposta incorreta\n");
					numTentativas++;}
				else {
					System.out.println("\nResposta incorreta nas três tentativas\n");
					numTentativas++;
				}
                break;
            default:
                System.out.println("\nOpção inválida.\n");
        }
    } while (respostaCorreta == false && numTentativas <= 3);
   
}
}