import java.util.Scanner;

public class DepositoEsaque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            System.out.println("\nMenu");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("Depósito de R$ %.2f efetuado com sucesso.\n", valorDeposito);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                        System.out.printf("Saque de R$ %.2f efetuado com sucesso.\n", valorSaque);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}