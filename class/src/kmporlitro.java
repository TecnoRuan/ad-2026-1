import java.util.Scanner;

public class kmporlitro {
    public static void main(String[] args) {
        float distancia,gasolina, consumo;
        Scanner lerfloat = new Scanner(System.in);
        System.out.println("Digite a distância percorrida: ");
        distancia = lerfloat.nextFloat();
        System.out.println("Quanto foi gasto de combustível? ");
        gasolina = lerfloat.nextFloat();
        consumo = (float) (distancia / gasolina);
        System.out.println("Seu veículo faz "+consumo+" kilômetros por litro");
    }

}
