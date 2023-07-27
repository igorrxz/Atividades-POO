

import java.util.Scanner;


public class Exercicios05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          System.out.println("Fale um número");
        int a = sc.nextInt();

        System.out.println("Fale um segundo número");
        int b = sc.nextInt();

        System.out.println("Fale um terceiro número");
        int c = sc.nextInt();
        int aux;

        if(a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }


        System.out.println("----");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);




        sc.close();
    }
}
