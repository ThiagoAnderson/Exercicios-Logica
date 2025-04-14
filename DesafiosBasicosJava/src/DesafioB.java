import java.util.Scanner;

public class DesafioB {
    public static void main(String[] args) {
        /*Faça um algoritmo para receber um número qualquer e imprimir na tela
         se o número é par ou ímpar, positivo ou negativo.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número para verificação:");
        int num = input.nextInt();
        if(num % 2 == 0){
            if(num > 0){
                System.out.println(num+" é número par positivo.");
            }else{
                System.out.println(num+" é número par negativo.");
            }
        }else{
            if(num > 0){
                System.out.println(num+" é número ímpar positivo.");
            }else{
                System.out.println(num+" é número ímpar negativo.");
            }
        }
    }
}
