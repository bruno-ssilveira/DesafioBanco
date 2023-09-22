import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nomeCliente = "José";
        String tipoConta = "Corrente";
        double saldo = 1800.50;

        System.out.println("****************************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da conta: " + "R$" + saldo);
        System.out.println("\n***************************");

        int sair = 0;

        while (sair != 4) {
            System.out.println("""
                    \nOperações
                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """);

            System.out.println("Digite a opção desejada:");
            int opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo da conta é " + "R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor a receber?");
                double valorReceber = leitor.nextDouble();
                saldo += valorReceber;
                System.out.println("Recebido! Saldo atualizado " + "R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Qual o valor a transferir?");
                double valorTransferir = leitor.nextDouble();
                if (valorTransferir <= saldo) {
                    saldo -= valorTransferir;
                    System.out.println("Transferência realizada com sucesso! Saldo atualizado " + "R$" + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (opcao == 4) {
                sair = 4;
            } else {
                System.out.println("Opção inválida!");
            }
        }

    }

}