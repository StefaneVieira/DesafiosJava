public class CalculoBissexto {
    public static void main(String[] args) {
        int ano;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um ano com 4 dígitos:");
        ano = input.nextInt();

        while (ano < 1000 || ano > 10000) {
            System.out.println("Formato inválido. Insira um ano com 4 dígitos: ");
            ano = input.nextInt();
        }
        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.printf("O ano %d é bissexto.", ano);
        } else if (ano % 400 == 0 && ano % 100 != 0) {
            System.out.printf("O ano %d é bissexto.", ano);
        } else {
            System.out.printf("O ano %d não é bissexto.", ano);
        }
    }
}
