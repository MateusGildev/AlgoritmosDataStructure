import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[5];
        int aux = 0;
        int cont = 0;

        for (int c = 0; c<vetor.length; c++){ //CRIA E ARMAZENA UM ARRAY ALEATORIO
            vetor[c] = random.nextInt(100);
        }

        System.out.println("Vetor NÃO ordenado: ");
        formatAndPrintArray(vetor);
        System.out.println("----------------------------------");

        for (cont = 0; cont < vetor.length; cont++) {
            for (int posicao = 0; posicao < vetor.length - 1; posicao++) {
                if (vetor[posicao] > vetor[posicao + 1]) {
                    aux = vetor[posicao];
                    vetor[posicao] = vetor[posicao + 1];
                    vetor[posicao + 1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        formatAndPrintArray(vetor);
    }

    public static void formatAndPrintArray(int[] array) { //FORMATÇÃO DO ARRAY
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", "); // Separador entre elementos
            }
            System.out.print(array[i]);
        }
        System.out.println(); // Pular uma linha após imprimir o array
    }
}
