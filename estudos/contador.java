import java.util.Scanner;
public class ContadorDiasVividos
{
	public static void main(String[] args) {
	    int idade;
        int dias = 365; 
        int horas = 24; 
        int TotalDias;
        int TotalHoras;
        
        Scanner input = new Scanner(System.in);
        
       System.out.println("Quantos anos você tem?");
       idade = input.nextInt();
       
       TotalDias = idade * dias;
       TotalHoras = TotalDias * horas;
          
      System.out.println("Você já viveu " + TotalDias + " dias e " + TotalHoras + " horas.");
        	}
}
