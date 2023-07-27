import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Igor Ximenes";
        String tipoConta = "Corrente";
        double  saldo = 1599;
        int opcao = 0;

        System.out.println("*********************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*********************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber Valor
                4 - Sair
                **
                """;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor da transferência?");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo += - valor;
                    System.out.println("Novo Saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção Invalidada!");
            }
        }












        sc.close();
    }
}
