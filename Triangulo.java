//2. Dados 3 valores (poss�veis lados) verificar se eles formam um tri�ngulo, e em caso positivo, dizer se � equil�tero, is�sceles ou escaleno.

import java.util.Scanner;

class Triangulo {
  public static void main(String args[]) {

      Scanner entrada = new Scanner(System.in);
      float a, b, c;
      boolean triangulo;

      System.out.println("Digite um valor para o lado A do tri�ngulo:");
      a = entrada.nextFloat();
      System.out.println("Digite um valor para o lado B do tri�ngulo:");
      b = entrada.nextFloat();
      System.out.println("Digite um valor para o lado C do tri�ngulo:");
      c = entrada.nextFloat();

      // Verifica se os lados formam um tri�ngulo

      if (a >= b && a >= c) {
        if (b + c > a) {
            triangulo = true;
        }
        else {
            triangulo = false;
        }
      }
      else if (b >= a && b >= c) {
        if (a + c > b) {
            triangulo = true;
        }
        else {
            triangulo = false;
        }
      }
      else if (c >= a && c >= b) {
        if (a + b > c) {
            triangulo = true;
        }
        else {
            triangulo = false;
        }
      }
      else {
            triangulo = false;
      }

      // Verifica o tipo de tri�ngulo

      if (triangulo = true && a == b && a == c && b == c) {
        System.out.println("Seu tri�ngulo � equil�tero");
      }
      else if (triangulo = true && a == b || a == c || b == c) {
        System.out.println("Seu tri�ngulo � is�sceles");
      }
      else if (triangulo = true && a != b && a != c && b != c) {
        System.out.println("Seu tri�ngulo � escaleno");
      }
      else {
        System.out.println("Os valores n�o formam um tri�ngulo");
      }

  }
}
