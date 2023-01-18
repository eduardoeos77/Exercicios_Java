// 1. Uma loja oferece para seus clientes um desconto de acordo com o valor da compra.
//Este desconto é de 20% se o valor da compra for maior ou igual a R$ 300,00 e 15% se for menor.
//Dado o valor do produto, mostre o valor (descontado) da compra do cliente e o valor do desconto obtido.

import java.util.Scanner;

class Desconto {
  public static void main(String args[]) {

    Scanner entrada = new Scanner(System.in);
    double desconto;
    double descontado;

    System.out.println("Entre o valor de sua compra:");
    double compra = entrada.nextDouble();

    if (compra >= 300) {
      desconto = 0.2 * compra;
      descontado = compra - desconto;
    }
    else {
      desconto = 0.15 * compra;
      descontado = compra - desconto;
    }

    System.out.println("O valor de seu desconto é: " + desconto + " e o valor de sua compra com desconto aplicado é: " + descontado);
  }
}
