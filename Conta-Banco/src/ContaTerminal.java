import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double saldo = 25;
    double valorSolicitado = 18;
    System.out.println("Seu saldo atual é: R$" + saldo);
    System.out.println("Digite o valor que deseja sacar: " + valorSolicitado);
    
    
    if (saldo >= valorSolicitado) {
      saldo -= valorSolicitado;
      System.out.println("Saque realizado com sucesso!");
      System.out.println("Seu novo saldo é: R$" + saldo);
    } else {
      System.out.println("Saldo insuficiente para realizar o saque de: R$" + valorSolicitado);
    }

    scanner.close();

    saldo = 15;
    valorSolicitado = 22;
    System.out.println("Seu saldo atual é: R$" + saldo);
    System.out.println("Digite o valor que deseja sacar: " + valorSolicitado);
    
    if (saldo >= valorSolicitado) {
      saldo -= valorSolicitado;
      System.out.println("Saque realizado com sucesso!");
      System.out.println("Seu novo saldo é: R$" + saldo);
    } else {
      System.out.println("Saldo insuficiente para realizar o saque de R$" + valorSolicitado);
    }

    scanner.close();
  }
}