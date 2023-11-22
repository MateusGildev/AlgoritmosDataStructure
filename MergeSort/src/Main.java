import java.util.Random;

public class Main {

    private static int[] mergeSort(int[] inputVetor) {
        int inputLength = inputVetor.length;

        if (inputLength < 2) {
            return inputVetor;
        }

        int meioIndex = inputLength / 2;
        int[] ladoEsquerdo = new int[meioIndex];
        int[] ladoDireito = new int[inputLength - meioIndex];

        for (int i = 0; i < meioIndex; i++) {
            ladoEsquerdo[i] = inputVetor[i];
        }

        for (int i = meioIndex; i < inputLength; i++) {
            ladoDireito[i - meioIndex] = inputVetor[i];
        }

        mergeSort(ladoEsquerdo);
        mergeSort(ladoDireito);

        return merge(inputVetor, ladoEsquerdo, ladoDireito);
    }

    private static int[] merge(int[] inputVetor, int[] ladoEsquerdo, int[] ladoDireito) {
        int EsquerdoSize = ladoEsquerdo.length;
        int DireitoSize = ladoDireito.length;

        int i = 0, j = 0, k = 0;

        while (i < EsquerdoSize && j < DireitoSize) {
            if (ladoEsquerdo[i] <= ladoDireito[j]) {
                inputVetor[k] = ladoEsquerdo[i];
                i++;
            } else {
                inputVetor[k] = ladoDireito[j];
                j++;
            }
            k++;
        }
        while (i < EsquerdoSize) {
            inputVetor[k] = ladoEsquerdo[i];
            i++;
            k++;
        }

        while (j < DireitoSize) {
            inputVetor[k] = ladoDireito[j];
            j++;
            k++;
        }

        return inputVetor;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[10000 ];

        System.out.println("VETOR NÃO ORDENADO:");
        for (int c = 0; c < vetor.length; c++) {
            vetor[c] = random.nextInt(100000);
            System.out.println(vetor[c]);
        }

        long startTime = System.currentTimeMillis(); // Captura o tempo inicial

        mergeSort(vetor);

        long endTime = System.currentTimeMillis(); // Captura o tempo final
        long elapsedTime = endTime - startTime; // Calcula o tempo decorrido em milissegundos

        System.out.println("VETOR ORDENADO:");
        for (int value : vetor) {
            System.out.println(value);
        }

        System.out.println("Tempo decorrido para ordenar o vetor: " + elapsedTime + " milissegundos");
    }
}



