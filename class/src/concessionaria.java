import java.util.Scanner;

public class concessionaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano;
        double valor, desconto, valorFinal;
        int ate2010 = 0;
        int totalGeral = 0;
        char opcao;
        do {
            System.out.print("Informe o ano do carro: ");
            ano = scanner.nextInt();

            System.out.print("Informe o valor do carro: ");
            valor = scanner.nextDouble();
            if (ano <= 2010) {
                desconto = valor * 0.12;
                ate2010++;
            } else {
                desconto = valor * 0.07;
            }
            valorFinal = valor - desconto;
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor a pagar: R$ " + valorFinal);
            totalGeral++;
            System.out.print("Deseja continuar? (S/N): ");
            opcao = scanner.next().charAt(0);
        } while (opcao == 'S' || opcao == 's');
        System.out.println("\nTotal de carros até 2010: " + ate2010);
        System.out.println("Total geral de carros: " + totalGeral);
    }
}