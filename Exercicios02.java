

import java.util.Scanner;

public class Exercicios02 {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);

     System.out.println("Digite a primeira nota: ");
     double a = sc.nextDouble();

     System.out.println("Digite a segunda nota: ");
     double b = sc.nextDouble();

     double mediaPonderada = (a * 3.5 + b * 7.5) / 11.5;

     System.out.println(" A média é: " + mediaPonderada);
     sc.close();
        
    }
}
