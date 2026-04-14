import java.util.Scanner;

public class conversaomoeda {
    public static void main(String[] args) {
        float real,dolar,conversao,cotacao;
        Scanner lerfloat = new Scanner(System.in);
        System.out.println("Informe o valor do dólar: ");
        cotacao = lerfloat.nextFloat();
        System.out.println("Informe a quantidade de dólares disponiveis: ");
        dolar = lerfloat.nextFloat();
        conversao = (cotacao * dolar);
        real = dolar * cotacao;
        System.out.println("A quantidade pós conversão é: "+conversao+"R$");

    }
}
