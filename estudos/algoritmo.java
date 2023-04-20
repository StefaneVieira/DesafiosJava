import java.util.Scanner;

public class Algoritmo {
    public static void main(String[] args) {
        int A, B, resultado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor de A:");
        A = scanner.nextInt();
        System.out.println("Insira o valor de B:");
        B = scanner.nextInt();

        if (A == B) {
            resultado = A + B;
        } else {
            resultado = A * B;
        }
        System.out.println("Resultado: " + resultado);
    }
}
