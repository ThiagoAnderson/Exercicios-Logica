import java.util.Scanner;

public class DesafioH {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia três valores
         inteiros diferentes e imprima na tela os valores em ordem decrescente.*/

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maior, meio, menor;

        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            maior = b;
            if (a > c) {
                meio = a;
                menor = c;
            } else {
                meio = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a > b) {
                meio = a;
                menor = b;
            } else {
                meio = b;
                menor = a;
            }
        }

        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);
    }
}
