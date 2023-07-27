

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma Frase: ");
        String frase = sc.nextLine();

        int contador = 0;


        for(int i = 0; i < frase.length(); i++) {

            char caracterAtual = frase.charAt(i);

            if(caracterAtual == 'A' || caracterAtual == 'a') {
                contador++;
            }
        }

System.out.println("TOTAL DE A NA FRASE: " + contador);


        sc.close();
    }   
}
