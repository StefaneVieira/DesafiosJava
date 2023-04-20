import java.util.Scanner;

public class CalculoFolga {
    public static void main(String[] args) {
        int tempoDeCasa;
        double salario;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o salário:");
        salario = scanner.nextDouble();
        System.out.println("Insira o tempo de serviço em meses:");
        tempoDeCasa = scanner.nextInt();

        if (salario < 950 && tempoDeCasa < 24) {
            salario *= (1.1);
            System.out.printf("O novo salário será de: %.2f e você terá direito a 7 dias de folga.",  salario);
        } else if (salario >= 950 && tempoDeCasa > 36) {
            salario *= (1.08);
            System.out.printf("O novo salário será de: %.2f e você terá direito a 12 dias de folga.", salario);
        } else {
            System.out.println("Você terá direito a 15 dias de folga.");
        }
    }
}
