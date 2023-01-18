/* Crie um menu que permita o usuário escolher as seguintes opções para um
jogo:
1 – Instruções
2 – Jogar
3 – Créditos
4 – Sair
Utilize a estrutura switch dentro de um laço do-while, na implementação. O
menu deixará de ser mostrado apenas quando o usuário escolher a opção 4 –
Sair. */

import java.util.Scanner;

class Menu {  
  public static void main(String args[]) {

    Scanner entrada = new Scanner(System.in);
    int escolha;

    System.out.println("\nBem vindo a um \"Jogo\"\n");
    
    do {
        System.out.println("Escolha uma das opções para continuar:\n");
        System.out.println("1 - Instruções");
        System.out.println("2 - Jogar");
        System.out.println("3 - Créditos");
        System.out.println("4 - Sair\n");
    
        escolha = entrada.nextInt();

        switch(escolha) {
            case 1:
                System.out.println("\nInstruções:");
                System.out.println("Use a seta para cima para pular;");
                System.out.println("Use a seta para baixo para questionar sua própria existência;");
                System.out.println("Use a seta para a esquerda para calcular seu imposto de renda;");
                System.out.println("Use a seta para a direita para ignorar seus problemas e seguir em frente.\n");
                break;
            case 2:
                System.out.println("\nEu quero jogar um jogo com você... Muahahaha\n");
                break;
            case 3:
                System.out.println("\nQuem lê os créditos de um jogo?");
                System.out.println("Sério, você tem gostos estranhos...");
                System.out.println("Eu quero dizer, Dark Souls 2 tem 11 minutos de créditos e nem um botão sequer pra pular eles, mas você escolheu ler os créditos desse \"jogo\" por conta própria.");
                System.out.println("Por quê?");
                System.out.println("Quem te machucou desse jeito?\n");
                break;
            case 4:
                System.out.println("\nFinalmente uma escolha sensata!\n");
                break;
            default:
                System.out.println("\nSua escolha deveria ser 1, 2, 3 ou 4. Não é tão difícil assim. Vamos tentar de novo:\n");
        }
    } while (escolha != 4);
  } 
}