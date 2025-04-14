import java.util.Scanner;

public class DesafioC {
    public static void main(String[] args) {
        /*Faça um algoritmo que leia dois valores inteiros A e B,
        se os valores de A e B forem iguais, deverá somar os dois valores,
        caso contrário devera multiplicar A por B. Ao final de
        qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        imprimir seu valor na tela.*/

        int A, B, C;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor de A:");
        A = input.nextInt();
        System.out.println("Insira o valor de B:");
        B = input.nextInt();
        if (A == B) {
            C = A + B;
            System.out.println("O valor de C é: " + C);
        } else {
            C = A * B;
            System.out.println("O valor de C é: "+ C);
        }

    }
}
