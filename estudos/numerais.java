import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        int numero;
        int resto;

        System.out.println("Digite o numero:");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        resto = numero % 2;
        if (resto==0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }
    }
}
