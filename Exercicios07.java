package ExerciciosJava;

import java.util.Scanner;

public class Exercicios07 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite uma quantia em Reais: ");
         int valor = sc.nextInt();

         int notas100 = valor / 100;
        int resto = valor % 100;

        int notas50 = resto / 50;
        resto = resto % 50;

        int notas20 = resto / 20;
        resto = resto % 20;

        int notas10 = resto / 10;
        resto = resto % 10;

        int notas5 = resto/5;
        resto = resto % 5;

        int notas1 = resto/1;
        resto = resto % 1;


        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);

        // FORMA MAIS COMPACTA

    // System.out.println("Digite uma quantia em reais:");
    // int valor = sc.nextInt();

    // int[] cedulas = new int []{100, 50, 20, 10, 5, 2, 1};
    // int resto = valor;

    // for (int i = 0; i < cedulas.length; i++) {
    //     int notas = resto / cedulas[i];
    //     resto = resto % cedulas[i];

    //     System.out.printf("%d nota(s) de R$\n");
    


















sc.close();
    }
    
}
