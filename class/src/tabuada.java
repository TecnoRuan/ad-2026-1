import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class tabuada {
    public static void tabuada (String... args) {

int n, t;
String o;
Scanner lerdados = new Scanner(System.in);

        System.out.println("Digite o numero para calcular a taboada");
n= lerdados.nextInt();
        System.out.println("Digite o numero final da tabuada: ");
        t= lerdados.nextInt();
        System.out.println("Digite + para somar, - para subtrair * para multiplicar, / para dividir");
o= lerdados.next();