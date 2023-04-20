import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número:");
        num = input.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.printf("%d é multiplo de 3 e 5.", num);
        } else if (num % 2 == 0) {
            System.out.printf("%d é par.", num);
        } else {
            System.out.printf("%d é ímpar.", num);
        }
    }
}
