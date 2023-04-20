import java.util.Scanner;

public class CalculoAltura {
    public static void main(String[] args) throws Exception {
        String nome;
        double alt, prodFem, prodMasc;
        int sexo;

        Scanner input = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Qual o seu nome?");
            nome = input.nextLine();
            System.out.println("Qual o seu sexo?" + "\n1 - Masculino " + "\n2 - Feminino");
            sexo = inputNumber.nextInt();
            if (sexo != 1 && sexo != 2) {
                throw new Exception("Insira uma informação válida");
            }
            System.out.println("Qual a sua altura?");
            alt = inputNumber.nextDouble();

            if (sexo == 2) {
                prodFem = alt * 2;
                System.out.println("O cálculo da altura de " + nome + " é " + prodFem + " metros");
            }
            if (sexo == 1) {
                prodMasc = alt / 2;
                System.out.println("O cálculo da altura de " + nome + " é " + prodMasc + " metros");
            }
        }

    }
}
