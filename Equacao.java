/* ADO 9 – Implemente o código descrito abaixo, no IDE Eclipse
Uma equação do 1º grau é da forma ax + b = 0, com a ≠ 0. Utilizando a classe
Random (.nextInt((max - min) + 1) + min;) ou o método random
((Math.random() * ((max - min) + 1)) + min;) implemente um programa que
receba do usuário os valores min e max, escolha aleatoriamente os valores de
a e b no intervalo [min, max], exiba a equação ax + b = 0, e mostre a solução
correspondente. */

import java.util.Random;
import java.util.Scanner;

class Equacao {
    public static void main(String args[]) {
        
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        int a = 0, b, min, max;
        float solucao;

        System.out.println("Digite um valor mínimo:");
        min = entrada.nextInt();

        System.out.println("Digite um valor máximo:");
        max = entrada.nextInt();

        while (a == 0) {
            a = random.nextInt((max - min) + 1) + min;
        }

        b = random.nextInt((max - min) + 1) + min;

        System.out.println("Sua equação de primeiro grau na forma ax + b = 0 é:\n");

        if (b == 0) {
            System.out.println(a + "x = 0");
        }
        else if (b < 0) {
            System.out.println(a + "x" + b + " = 0");
        }
        else {
            System.out.println(a + "x+" + b + " = 0");
        }

        solucao = (float) -b/a;

        System.out.println("\nE a solução da equação é: " + -b + "/" + a + " ou " + solucao);
    }
}