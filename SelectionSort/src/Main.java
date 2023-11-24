import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[5];

        int c;

        System.out.println("VETOR DESORDENADO");
        for (c = 0; c < vetor.length; c++) {
            vetor[c] = random.nextInt(30);
            System.out.println(vetor[c]);
        }

        long startTime = System.currentTimeMillis();

        // Encontrando o menor valor no vetor
        int valMinimo = vetor[0];
        for (c = 0; c < vetor.length; c++) {
            if (vetor[c] < valMinimo) {
                valMinimo = vetor[c];
            }
        }

        // Continuação para ordenação usando Selection Sort
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho - 1; i++) {
            // Encontrando o índice do menor elemento no restante do array
            int indiceMenor = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // Trocando o elemento atual pelo menor encontrado
            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }

        long endTime = System.currentTimeMillis();
        long resultado = endTime - startTime;

        System.out.println("VETOR ORDENADO");
        for (int valor : vetor) {
            System.out.println(valor);
        }
        System.out.println("Tempo de execução do algoritmo: " + resultado + " milisegundos");
    }
}
