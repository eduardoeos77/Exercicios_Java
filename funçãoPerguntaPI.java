import java.util.Scanner;

class Main {

    static int pontuacao = 0;   // pontuacao é uma variável global (que pode ser acessada de qualquer lugar do código) que nesse caso serve como flag para salvar a pontuação do jogador.

static void pergunta(String str, String[] arr, char resposta) {
    // pergunta é um método que pode ser chamado quando quisermos printar uma pergunta
    // ele recebe como parâmetros: uma string (a pergunta em questão), um array ou vetor (com as possíveis respostas) e um char (equivalente à resposta correta).

    Scanner entrada = new Scanner(System.in);
    
    System.out.println(str); // printa a pergunta

    for (int i = 0; i < arr.length; i++) { // o laço for percorre o array e imprime as respostas possíveis.
        System.out.println(arr[i]);
    }

    char escolha = entrada.next().charAt(0); // lê o caracter digitado

    if (escolha == resposta) { // verifica se a escolha foi a correta
        System.out.println("Correto!"); 
        pontuacao++; // se sim, atualiza a variável pontuação

    }
    else {
        System.out.println("Resposta errada...");
    }
    System.out.println("Sua pontuação é: " + pontuacao); // aqui a pontuação é impressa só para sabermos se está funcionando
}

    public static void main(String args[]) { 
        
        
        pergunta("Essa é uma pergunta", new String[] {"a - Resposta 1", "b - Resposta 2", "c - Resposta 3"}, 'b');
        // aqui o método pergunta é chamado na classe principal
        // como ele já foi escrito anteriormente, não precisamos copiar e colar as mesmas coisas várias vezes, só passar os parâmetros necessários
        // aqui ele recebe a string "Essa é uma pergunta",
        // o array com as respostas possíveis ["a - Resposta 1", "b - Resposta 2", "c - Resposta 3"] (que deve ser declarado dentro do método)
        // e o caracter correspondente à resposta correta.

        // podemos facilmente criar uma nova pergunta só passando novos parâmetros
        // e podemos aumentar ou diminuir o número de possíveis respostas, porque o laço for dentro do método pergunta cuida de imprimir todas, idependente do número de elementos no array
        pergunta("Quanto é 2 + 2?", new String[] {"a - 5", "b - 22", "c - 4", "d - 42", "e - Nenhuma das respostas anteriores"}, 'c');
        
    } 
  }