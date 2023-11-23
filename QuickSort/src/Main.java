import java.util.Random;

public class Main {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } // método swap que possa lidar especificamente com arrays.

    public static void quickSort(int[] inputVetor, int ladoEsquerdo, int ladoDireito) {
        if (ladoEsquerdo < ladoDireito) {
            int indexPivot = partition(inputVetor, ladoEsquerdo, ladoDireito);
            quickSort(inputVetor, ladoEsquerdo, indexPivot - 1);
            quickSort(inputVetor, indexPivot + 1, ladoDireito);
        }

    }

    public static int partition(int[] inputVetor, int ladoEsquerdo, int ladoDireito) {
        int pivot = inputVetor[ladoEsquerdo];
        int i = ladoEsquerdo;

        for (int j = ladoEsquerdo + 1; j <= ladoDireito; j++) {
            if (inputVetor[j] <= pivot) {
                i += 1;
                swap(inputVetor, i, j);
            }
        }

        swap(inputVetor, ladoEsquerdo, i);
        return i;
    }


    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[10000];
        int pivot = vetor[0];


        System.out.println("VETOR NÃO ORDENADO:");
        for (int c = 0; c < vetor.length; c++) {
            vetor[c] = random.nextInt(10000);
            System.out.println(vetor[c]);
        }

        long startTime = System.currentTimeMillis();

        partition(vetor, 0, vetor.length - 1);

        long endTime = System.currentTimeMillis();
        long resultado = (endTime-startTime);

        System.out.println("VETOR ORDENADO: ");
        for (int c = 0; c < vetor.length; c++) {
            System.out.println(vetor[c]);
        }
        System.out.println("Tempo decorrido para ordenar o vetor: " + resultado + " milissegundos");
    }
}