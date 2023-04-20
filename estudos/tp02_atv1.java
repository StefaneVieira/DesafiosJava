/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class tp02_atv1
{
	public static void main(String[] args) {
	    double perimetro;
        double area;
        double lado;
        
        Scanner input = new Scanner(System.in);
        
        //double = input.nextDouble();
        //string = input.nextLine();
        
        System.out.println("Digite o lado:");
        lado = input.nextDouble();
        area = lado * lado;
        perimetro = lado * 4;
    
        System.out.println("A área do quadrado é " + area);
        System.out.println("O perímetro do quadrado é " + perimetro);
    }
}