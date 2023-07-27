package ExerciciosJava;
import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fale um número");
        int a = sc.nextInt();

        System.out.println("Fale um segundo número");
        int b = sc.nextInt();

        System.out.println("Fale um terceiro número");
        int c = sc.nextInt();

       int maior = a;

       if(b > a){
        maior = b;

       }

       else if (c > b){
            maior = c;
       }

       System.out.println("O maior número é: " + maior);
sc.close();
            
           

        
        

       
        
    
    }
}
