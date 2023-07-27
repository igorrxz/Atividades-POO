package ExerciciosJava;
import java.util.Scanner;

public class Exercicios03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String a = sc.nextLine();

        System.out.println("Qual o seu salário bruto? ");
        int b = sc.nextInt();

        System.out.println("Quantas vendas você fez neste mês?");
        int c = sc.nextInt();

        double d = 0.15 * c;
        double e = b + d;

        System.out.println("Olá," + a + " seu salário bruto é " + b + " com suas vendas, seu salário fica " + e);

        sc.close();
    }
    
}
