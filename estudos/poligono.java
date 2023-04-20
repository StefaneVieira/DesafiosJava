import java.util.Scanner;

public class CalculoPoligono {
    public static void main(String[] args) {

        double valComp, valPer, valArea;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número de lados");
        int lados = scanner.nextInt();

        if (lados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } if (lados > 6) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO, " + "NUMERO DE LADOS INVÁLIDO");
        } if (lados < 2) {
            System.out.println("NUMERO DE LADOS INVÁLIDO");
        }

        if (lados == 2) {
            System.out.println("Insira a medida do lado");
            double medLado = scanner.nextDouble();
            valComp = lados * medLado;
            System.out.println("RETA: " + valComp);
        } 
      
      else if (lados == 3) {
            System.out.println("Insira a medida do lado");
            double medLado = scanner.nextDouble();
            valPer = medLado + medLado + medLado;
            System.out.println("TRIÂNGULO: " + valPer);
        } 
      
      else if (lados == 4) {
            System.out.println("Insira a medida do lado");
            double medLado = scanner.nextDouble();
            valArea = lados * medLado;
            System.out.println("QUADRADO: " + valArea);
        } 
      
      else if (lados == 5) {
            System.out.println("Insira a medida do lado");
            double medLado = scanner.nextDouble();
            valPer = medLado + medLado + medLado + medLado + medLado;
            System.out.println("PENTÁGONO: " + valPer);
        } 
      
      else if (lados == 6) {
            System.out.println("Insira a medida do lado");
            double medLado = scanner.nextDouble();
            valArea = (6 * (Math.pow(medLado, 2) * Math.sqrt(3))) / 4;
            System.out.println("HEXÁGONO: " + valArea);
        }

    }
}
