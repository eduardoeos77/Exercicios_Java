/* ADO 8 – Implemente o código descrito abaixo, no IDE Eclipse
Utilizando a classe Random (java.util.Random) ou o método random
(Math.random()) implemente um programa que simule o lançamento de 1
dado de 6 faces 1.000.000 (1 milhão) de vezes consecutivas. Ao final apresente
a porcentagem de vezes que cada face apareceu, lembrando que a soma de
todas as porcentagens será 100% (aproximadamente). */

import java.util.Random;

class Dado {
    public static void main(String args[]) {

        Random random = new Random(); //variável para gerar números aleatórios
        int resultado; //variável para guardar o valor aleatório
        double countFace1 = 0;
        double countFace2 = 0;
        double countFace3 = 0; //variáveis para contar a quantidade de vezes que cada face saiu
        double countFace4 = 0;
        double countFace5 = 0;
        double countFace6 = 0;

        for (int i = 0; i < 1_000_000; i++) { //laço para gerar um número aleatório 1 milhão de vezes

            resultado = random.nextInt(6) + 1; //aqui a função random.nextInt(6) gera um número aleatório entre 0 e 5, 
                                               //por isso é preciso somar 1 para que ela gere números entre 1 e 6

            switch(resultado) { //aqui o switch serve para verificar qual número foi gerado e atualizar o valor das variáveis contadoras
                case 1: //se o resultado for 1, countFace1 é aumentada em 1
                    countFace1++;
                    break;
                case 2: //se o resultado for 2, countFace2 é aumentada em 1 também
                    countFace2++;
                    break;
                case 3: //e o mesmo para as outras contadoras
                    countFace3++;
                    break;
                case 4:
                    countFace4++;
                    break;
                case 5:
                    countFace5++;
                    break;
                case 6:
                    countFace6++;
                    break;
            }
        }

        //no fim temos quantas vezes cada face saiu depois do "dado" ser jogado 1 milhão de vezes

        System.out.println("\nA  porcentagem do resultado de cada face depois de 1 milhão de jogadas é:\n");
        System.out.println("Face 1: " + countFace1 * 100 / 1_000_000 + "%"); //aí fazemos esse cálculo para sabermos a porcentagem de vezes que cada face saiu
        System.out.println("Face 2: " + countFace2 * 100 / 1_000_000 + "%");
        System.out.println("Face 3: " + countFace3 * 100 / 1_000_000 + "%");
        System.out.println("Face 4: " + countFace4 * 100 / 1_000_000 + "%");
        System.out.println("Face 5: " + countFace5 * 100 / 1_000_000 + "%");
        System.out.println("Face 6: " + countFace6 * 100 / 1_000_000 + "%");
    }
}
