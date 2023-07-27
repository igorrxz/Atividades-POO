

import java.util.Scanner;

public class Exercicios08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá casal, qual a renda fixa do homem?");
        double rendaHomem = sc.nextDouble();

        System.out.println("E da mulher?");
        double rendaMulher = sc.nextDouble();

        double rendaTotal = rendaHomem + rendaMulher;

        double aliquota = 0;

        if(rendaTotal < 900){
            aliquota = 0;
        } else if(rendaTotal > 900 && rendaTotal <= 1500){
            aliquota = 0.10;
        } else if(rendaTotal > 1500 && rendaTotal <= 2500){
            aliquota = 0.15;
        } else {
            aliquota = 0.25;
        }

        double impostoRenda = aliquota * rendaTotal;
        double rendaLiquida = rendaTotal - impostoRenda;

        System.out.println("Renda Total: " + rendaTotal);
        System.out.println("Aliquota Utilizada: " + aliquota);
        System.out.println("Imposto de Renda: " + impostoRenda);
        System.out.println("Renda Liquida: " + rendaLiquida);
        













        sc.close();
    }
}
