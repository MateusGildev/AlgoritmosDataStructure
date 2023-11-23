import java.util.Random;

import java.text.DecimalFormat;


public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[5];
        int aux = 0;

        for (int c = 0; c < vetor.length; c++) {
            vetor[c] = random.nextInt(100);
        }
        System.out.println("-------BUBBLE SORT---------");
        System.out.println("Vetor NÃO ordenado: ");
        formatAndPrintArray(vetor);
        System.out.println("----------------------------------");

        long startTime = System.currentTimeMillis();

        for (int cont = 0; cont < vetor.length; cont++) {
            for (int posicao = 0; posicao < vetor.length - 1; posicao++) {
                if (vetor[posicao] > vetor[posicao + 1]) {
                    aux = vetor[posicao];
                    vetor[posicao] = vetor[posicao + 1];
                    vetor[posicao + 1] = aux;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Vetor organizado:");
        formatAndPrintArray(vetor);
        long executionTime = endTime - startTime;
        double executionTimeInSeconds = executionTime / 1000.0; // Converter para segundos

        DecimalFormat df = new DecimalFormat("#0.0"); // Formato com uma casa decimal
        String formattedExecutionTime = df.format(executionTimeInSeconds);

        System.out.println("TEMPO DE EXECUÇÃO: " + formattedExecutionTime + " segundos");
    }

    public static void formatAndPrintArray(int[] array) { //FORMATAÇÃO DO ARRAY
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", "); // Separador entre elementos
            }
            System.out.print(array[i]);
        }
        System.out.println(); // Pular uma linha após imprimir o array
    }
}
