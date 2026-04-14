import java.util.Scanner;

public class conversaomoeda {
    public static void main(String[] args) {
        float real,dolar,conversao;
        Scanner lerfloat = new Scanner(System.in);
        System.out.println("Informe o valor do dólar: ");
        dolar = lerfloat.nextFloat();
        System.out.println("Informe a quantidade em reais: ");
        real = lerfloat.nextFloat();
        conversao = real / dolar;
        System.out.println("A quantidade pós conversão é: "+conversao);

    }
}
