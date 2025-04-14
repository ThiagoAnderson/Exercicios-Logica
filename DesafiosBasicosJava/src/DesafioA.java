import java.util.Scanner;

public class DesafioA {
    public static void main(String[] args) {
        /*
       Faça um algoritmo que leia os valores de A, B, C
       e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
       */

        int[] valores = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os valores de A,B e C respectivamente.");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = input.nextInt();
        }
        int somaAmaisB = valores[0] + valores[1];
        if(somaAmaisB < valores[2]){
            System.out.println("A soma de "+valores[0]+" e "+valores[1]+" é menor que "+valores[2]);
        }else{
            System.out.println("A soma de "+valores[0]+" e "+valores[1]+" não é menor que "+valores[2]);

        }


    }
}
