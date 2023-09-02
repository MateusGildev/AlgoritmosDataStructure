import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[50000];
        int i, j, eleito, count;

        System.out.println("---------INSERTION SORT--------");
        System.out.println("vetor desordenado:");
        for (count = 0; count < vetor.length; count++) {
            vetor[count] = random.nextInt(100);
            System.out.print(vetor[count]);

            if (count < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        long startTime = System.currentTimeMillis();
        // Ordenação por inserção
        for (i = 1; i < 5; i++) {
            eleito = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > eleito) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = eleito;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("vetor ordenado:");
        for (i = 0; i < 5; i++) {
            System.out.print(vetor[i]);

            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println();
        long executionTime = endTime - startTime;
        System.out.println("TEMPO DE EXECUÇÃO: "+executionTime+" ms");
    }
}


