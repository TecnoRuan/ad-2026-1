import java.util.Scanner;

public class idade75pessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 75; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            if (idade >= 60) {
                System.out.println("Pessoa " + i + ": Idoso");
            } else if (idade >= 18) {
                System.out.println("Pessoa " + i + ": Maior de idade");
            } else {
                System.out.println("Pessoa " + i + ": Menor de idade");
            }
        }
    }
}