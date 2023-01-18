//2. Dados 3 valores (possíveis lados) verificar se eles formam um triângulo, e em caso positivo, dizer se é equilátero, isósceles ou escaleno.

import java.util.Scanner;

class Triangulo {
  public static void main(String args[]) {

      Scanner entrada = new Scanner(System.in);
      float a, b, c;
      boolean triangulo;

      System.out.println("Digite um valor para o lado A do triângulo:");
      a = entrada.nextFloat();
      System.out.println("Digite um valor para o lado B do triângulo:");
      b = entrada.nextFloat();
      System.out.println("Digite um valor para o lado C do triângulo:");
      c = entrada.nextFloat();

      // Verifica se os lados formam um triângulo

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

      // Verifica o tipo de triângulo

      if (triangulo = true && a == b && a == c && b == c) {
        System.out.println("Seu triângulo é equilátero");
      }
      else if (triangulo = true && a == b || a == c || b == c) {
        System.out.println("Seu triângulo é isósceles");
      }
      else if (triangulo = true && a != b && a != c && b != c) {
        System.out.println("Seu triângulo é escaleno");
      }
      else {
        System.out.println("Os valores não formam um triãngulo");
      }

  }
}
