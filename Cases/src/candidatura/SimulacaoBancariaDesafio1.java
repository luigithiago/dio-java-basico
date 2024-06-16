package candidatura;

import java.util.Scanner;

public class SimulacaoBancariaDesafio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Saldo = 0.0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    Saldo += valorDeposito;
                    System.out.println("Saldo atual: " + Saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > Saldo) {
                      System.out.println("Saldo insuficiente.");
                      System.out.println("Programa encerrado."); 
                      break;
                    }
                    else {
                    Saldo -= valorSaque;
                      System.out.println("Saldo atual: " + Saldo);
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual:  " + Saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
