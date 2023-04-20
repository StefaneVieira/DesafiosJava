import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar?");
        n = input.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número:");
            vetor[i] = input.nextInt();
        }
        System.out.println("Números negativos:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
