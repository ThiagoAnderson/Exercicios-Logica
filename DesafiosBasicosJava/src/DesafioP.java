import java.util.Scanner;

public class DesafioP {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia três valores que representam
         os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
          equilátero, isósceles ou escaleno.
       */

        Scanner input = new Scanner(System.in);

        double a,b,c;
        System.out.println("Entre com o valor de cada lado do triangulo");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if(a + b > c && a + c > b && c + b > a){
            if(a == b && b == c){
                System.out.println("Triangulo equilatero");
            } else if (a == b || c == b || a == c) {
                System.out.println("Triangulo Isósceles");
            }else{
                System.out.println("Triangulo Escaleno");
            }

        }else{
            System.out.println("Valores invalidos, não formam um triângulo");
        }
    }
}
