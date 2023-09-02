import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[5];
        int aux, posicaoVet, cont, eleito;

        System.out.println("VETOR DESORDENADO:");
        for (cont = 0; cont < vetor.length; cont++) {
            vetor[cont] = random.nextInt(50); // Gera números aleatórios de 0 a 49
            System.out.print(vetor[cont] + ", ");
        }
        System.out.println();

        for (posicaoVet = 0; posicaoVet < vetor.length - 1; posicaoVet++) {
            eleito = vetor[posicaoVet];
            for (cont = posicaoVet + 1; cont < vetor.length; cont++) {
                if (vetor[cont] < vetor[posicaoVet]) {
                    aux = vetor[cont];
                    vetor[cont] = vetor[posicaoVet];
                    vetor[posicaoVet] = aux;
                }
            }
        }

        System.out.println("\nVETOR ORDENADO:");
        for (cont = 0; cont < vetor.length; cont++) {
            System.out.print(vetor[cont] + ", ");
        }
    }
}
