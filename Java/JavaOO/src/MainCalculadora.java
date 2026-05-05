import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        int resultado1 = calc.somar(a, b);
        int resultado2 = calc.dividir(a, b);

        System.out.println("Soma: " + resultado1);
        System.out.println("Divisão: " + resultado2);

    }
}