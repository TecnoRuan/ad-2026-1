import java.util.Scanner;

public class MainContaBancaria {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ContaBancaria conta = new ContaBancaria();

    System.out.print("Digite o nome do titular: ");
    conta.titular = sc.nextLine();

    System.out.print("Digite o saldo inicial: ");
    conta.saldo = sc.nextDouble();

    conta.mostrarSaldo();

    System.out.print("\nDigite o valor para depósito: ");
    double deposito = sc.nextDouble();
    conta.depositar(deposito);
    conta.mostrarSaldo();

    System.out.print("\nDigite o valor para saque: ");
    double saque = sc.nextDouble();
    conta.sacar(saque);
    conta.mostrarSaldo();

}
}