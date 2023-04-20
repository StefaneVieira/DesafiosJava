import java.util.Scanner;

public class Coordenadas {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Insira a coordenada X");
        double X = inputNumber.nextDouble();
        System.out.println("Insira a coordenada Y");
        double Y = inputNumber.nextDouble();

        if (X > 0 && Y > 0) {
            System.out.println("Quadrante 1");
        } else if (X < 0 && Y < 0) {
            System.out.println("Quadrante 3");
        } else if (X > 0 && Y < 0) {
            System.out.println("Quadrante 4");
        } else if (X < 0 && Y > 0) {
            System.out.println("Quadrante 2");
        } else if (X == 0 && Y == 0) {
            System.out.println("NÃO ESTÁ EM NENHUM QUADRANTE");
        } else {
            System.out.println("NÃO ESTÁ EM NENHUM QUADRANTE");
        }
    }
}
