import java.util.Scanner;

public class DesafioQ {
    public static void main(String[] args) {
        /*Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a
         temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
         Fórmula: C = (5 * ( F-32) / 9)*/

        Scanner input = new Scanner(System.in);
        System.out.println("Informe uma temperatura em Fahrenheit");
        double temp = input.nextDouble();
        double celcius = (5 * ( temp-32) / 9);
        System.out.println("Temperatura Fahrenheit: "+temp);
        System.out.println("Temperatura Celsius: "+celcius);

        input.close();
    }
}
