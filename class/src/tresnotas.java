import java.util.Scanner;

public class tresnotas {
    public static void main(String[] args) {
        String nome;
        int nota1, nota2, nota3;
        float media;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do aluno: ");
        nome = scanner.nextLine();
        System.out.println("Nota da primeira prova: ");
        nota1 = scanner.nextInt();
        System.out.println("Nota da segunda prova: ");
        nota2 = scanner.nextInt();
        System.out.println("Nota da terceira prova: ");
        nota3 = scanner.nextInt();
        media = (float) (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media <= 5) {
        System.out.println("Reprovado");
    }else {
        System.out.println("Recuperação");
        }

    }
}
