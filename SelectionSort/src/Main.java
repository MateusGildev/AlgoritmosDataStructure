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
        int valMinimo = vetor[0];

        for (c = 0; c < vetor.length; c++) {
            if (vetor[c] < valMinimo) {
                valMinimo = vetor[c];
            }

        }


    }


}
