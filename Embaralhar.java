/* ADO 7 – Utilizando Collections, switch e do-while implemente uma questão de
múltipla escolha referente a alguma das outras disciplinas que você está
cursando neste semestre. Primeiro deverá ser apresentado o enunciado da
questão com as 5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e).
Depois que o usuário escolher uma opção, se for a resposta correta deverá ser
impresso “Resposta correta”, caso contrário “Resposta incorreta”. No caso de
“Resposta incorreta” a questão deve ser apresentada novamente para outra
tentativa, porém com as alternativas em outra ordem. Desta forma a cada nova
tentativa de resposta as opções/alternativas são “embaralhadas”. A questão
deixará de ser mostrada apenas quando a resposta correta for escolhida. */
 
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

class Embaralhar {  
  public static void main(String args[]) {

    Scanner entrada = new Scanner(System.in);
    char escolha;
    String resposta = "Memória RAM";
    boolean respostaCorreta = false;
	
	ArrayList<String> perguntas = new ArrayList<String>();
    perguntas.add("Memória RAM");
    perguntas.add("O cérebro de um cão desmemoriado");
    perguntas.add("Memória Póstumas de Brás Cubas");
    perguntas.add("A memória muscular de seu bíceps");
    perguntas.add("Eu esqueci...");

    Collections.shuffle(perguntas);

  System.out.println("\nDe acordo com o que você estudou em Conceitos de Computação, responda a seguinte questão:\n");
    
    do {
        System.out.println("Qual memória é conhecida como Memória Principal?\n");
        System.out.println("a - " + perguntas.get(0));
        System.out.println("b - " + perguntas.get(1));
        System.out.println("c - " + perguntas.get(2));
        System.out.println("d - " + perguntas.get(3));
		System.out.println("e - " + perguntas.get(4) + "\n");
    
       escolha = entrada.next().charAt(0);

        switch(escolha) {

            case 'a': case 'A':
                if (perguntas.get(0).equals(resposta)) {
                    System.out.println("\nResposta correta");
                    respostaCorreta = true;
                }
                else {
                    System.out.println("\nResposta incorreta\n");
                    Collections.shuffle(perguntas);
                }
                break;
            case 'b': case 'B':
                if (perguntas.get(1).equals(resposta)) {
                    System.out.println("\nResposta correta");
                    respostaCorreta = true;
                }
                else {
                    System.out.println("\nResposta incorreta\n");
                    Collections.shuffle(perguntas);
                }
                break;
            case 'c': case 'C':
                if (perguntas.get(2).equals(resposta)) {
                    System.out.println("\nResposta correta");
                    respostaCorreta = true;
                }
                else {
                    System.out.println("\nResposta incorreta\n");
                    Collections.shuffle(perguntas);
                }
                break;
            case 'd': case 'D':
                if (perguntas.get(3).equals(resposta)) {
                    System.out.println("\nResposta correta");
                    respostaCorreta = true;
                }
                else {
                    System.out.println("\nResposta incorreta\n");
                    Collections.shuffle(perguntas);
                }
                break;
            case 'e': case 'E':
                if (perguntas.get(4).equals(resposta)) {
                    System.out.println("\nResposta correta");
                    respostaCorreta = true;
                }
                else {
                    System.out.println("\nResposta incorreta\n");
                    Collections.shuffle(perguntas);
                }
                break;
            default:
                System.out.println("\nOpção inválida.\n");
                Collections.shuffle(perguntas);
        }
    } while (respostaCorreta != true);  
   
}
}
