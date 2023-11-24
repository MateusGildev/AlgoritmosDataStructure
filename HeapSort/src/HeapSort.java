import java.util.Random;

public class HeapSort {
    public void sort(int vetor[]) {
        int vetorLength = vetor.length;

        // Construindo o heap (rearranjar o array)
        for (int i = vetorLength / 2 - 1; i >= 0; i--) {
            heapify(vetor, vetorLength, i);
        }

        // Extraindo elementos do heap um por um
        for (int i = vetorLength - 1; i > 0; i--) {
            // Movendo a raiz (o maior elemento) para o fim do array
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;


            heapify(vetor, i, 0);
        }
    }

    // Para fazer um subárvore com raiz i ser um heap de um array com tamanho n
    void heapify(int vetor[], int n, int i) {
        int largest = i; // Inicializa o maior como raiz
        int ladoEsquerdo = 2 * i + 1; // Esquerdo = 2*i + 1
        int ladoDireito = 2 * i + 2; // Direito = 2*i + 2


        if (ladoEsquerdo < n && vetor[ladoEsquerdo] > vetor[largest]) {
            largest = ladoEsquerdo;
        }


        if (ladoDireito < n && vetor[ladoDireito] > vetor[largest]) {
            largest = ladoDireito;
        }


        if (largest != i) {
            int swap = vetor[i];
            vetor[i] = vetor[largest];
            vetor[largest] = swap;

            // Chamada recursiva para heapify a subárvore afetada
            heapify(vetor, n, largest);
        }
    }
    public static void printArray(int vetor[]) {
        int vetorlength = vetor.length;
        for (int i = 0; i < vetorlength; ++i) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        Random random = new Random();
        int[] vetor = new int[100000];
        int vetorLength = vetor.length;

        for (int c = 0; c < vetorLength; c++) {
            vetor[c] = random.nextInt(1000);
        }
        long startTime = System.currentTimeMillis();

        System.out.println("Array desordenado: ");
        //printArray(vetor);

        HeapSort heapSort = new HeapSort();
        heapSort.sort(vetor);

        long endTime = System.currentTimeMillis();
        long resultado = endTime - startTime;
        System.out.println("Array ordenado:");
        //printArray(vetor);
        System.out.println("Tempo de execução do algoritmo: " + resultado + " milisegundos");
    }
}
