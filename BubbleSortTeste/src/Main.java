import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = {44, 13, 30, 48, 29} ;
        int aux = 0;
        int posicaoVetor = 0, i;

        System.out.println("VETOR NAO ORDENADO:");
       /* for (int c = 0; c < array.length; c++) {
            array[c] = random.nextInt(50);
            System.out.println(array[c]);
        } */

        int numLoopsExternos = 0;
        int numLoopsInternos = 0;

        System.out.println("VETOR ORDENADO: ");
        for (i = 0; i < array.length; i++) {//i é o numero de loops externos que o alogritmo faz
            numLoopsExternos++;
            for (posicaoVetor = 0; posicaoVetor < (array.length - 1); posicaoVetor++) {
                numLoopsInternos++;
                if (array[posicaoVetor] > array[posicaoVetor + 1]) {
                    aux = array[posicaoVetor];
                    array[posicaoVetor] = array[posicaoVetor + 1];
                    array[posicaoVetor + 1] = aux;
                }
            }
            System.out.println(array[i]);
        }
        System.out.println("TAMANHO DO VETOR " + array.length);
        System.out.println("Numero de loops externos " + numLoopsExternos);
        System.out.println("Numero de loops internos " + numLoopsInternos);
    }
}



