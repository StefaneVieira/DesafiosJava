import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        final int numVendedores = 2;
        final int numColunas = 3;

        int vendas[][] = new int[numVendedores][numColunas];
        double mediaDiaria[] = new double[numColunas];
        double somaVendas = 0d;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numVendedores; i++) {
            System.out.println("Insira o código numérico do vendedor:");
            vendas[i][0] = input.nextInt();
            while (vendas[i][0] < 100 || vendas[i][0] > 1000) {
                System.out.println("Insira um código com três digitos:");
                vendas[i][0] = input.nextInt();
            }
            for (int j = 1; j < numColunas; j++) {
                System.out.println("Agora informe o valor de vendas do dia " + j + ":");
                vendas[i][j] = input.nextInt();
            }
        }
        for (int i = 1; i < numColunas; i++) {
            for (int j = 0; j < numVendedores; j++) {
                somaVendas += vendas[j][i];
                mediaDiaria[i] = somaVendas / numVendedores;
            }
            somaVendas = 0;
            System.out.println("Média dia " + i + " : " + mediaDiaria[i]);
        }
        System.out.println("Vendas acima da média: ");
        for (int i = 0; i < numVendedores; i++) {
            for (int j = 1; j < numColunas; j++) {
                if (vendas[i][j] > mediaDiaria[j]) {
                    System.out.printf("Codigo funcionário: %d. Total de vendas no dia %d: %d.%n", vendas[i][0], j, vendas[i][j]);
                }
            }
        }
    }
}
