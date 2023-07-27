package ExerciciosJava;
import java.util.Scanner;

public class Exercicios11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quando começou o jogo: ");
        int horaInicio = sc.nextInt();

        System.out.println("Digite quando o jogo terminou: ");
        int horaTermino = sc.nextInt();

        sc.close();

        int duracao = 0;

        if(horaInicio < horaTermino) {
            duracao = horaTermino - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaTermino;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        
    }
    
}
