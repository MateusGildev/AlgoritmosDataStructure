import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[100000];
        int i, j, eleito, count;

        System.out.println("---------INSERTION SORT--------");
        System.out.println("Vetor desordenado:");
        for (count = 0; count < vetor.length; count++) {
            vetor[count] = random.nextInt(1000);
            System.out.print(vetor[count]);

            if (count < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        long startTime = System.currentTimeMillis();

        // Ordenação por inserção
        for (i = 1; i < vetor.length; i++) {
            eleito = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > eleito) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = eleito;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Vetor ordenado:");
        for (i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);

            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        long executionTime = endTime - startTime;
        System.out.println("TEMPO DE EXECUÇÃO: " + executionTime + " milisegundos");
    }
}
