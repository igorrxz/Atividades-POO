
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N");
        double n = sc.nextDouble();

        double a = 0;

        double num = n;
        double den = 1;

        while (num >= 1) {
            a += num / den;
            num--;
            den++;
        }

        System.out.println("A = " + a);








        sc.close();
    }
}
