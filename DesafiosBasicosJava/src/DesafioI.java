import java.util.Scanner;

public class DesafioI {
    public static void main(String[] args) {
        /*Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de
        uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
        de acordo com a tabela abaixo:

        Fórmula do IMC = peso / (altura)²

        Tabela Condições IMC

        Abaixo de 18,5   | Abaixo do peso

        Entre 18,6 e 24,9 | Peso ideal (parabéns)

        Entre 25,0 e 29,9 | Levemente acima do peso

        Entre 30,0 e 34,9 | Obesidade grau I

        Entre 35,0 e 39,9 | Obesidade grau II (severa)

        Maior ou igual a 40 | Obesidade grau III (mórbida)*/

        Scanner input = new Scanner(System.in);
        double peso,altura;
        System.out.println("Insira a sua altura abaixo:");
        altura = input.nextDouble();
        System.out.println("Insira seu peso abaixo:");
        peso = input.nextDouble();

        double imc = peso / (altura*altura);
        if(imc <= 18.5){
            System.out.println("IMC: "+imc+" ,abaixo do peso.");
        }else if(imc >= 18.6 && imc <= 24.9){
            System.out.println("IMC: "+imc+" ,peso ideal (párabens)");
        }else if(imc >= 25.0 && imc <= 29.9){
            System.out.println("IMC: "+imc+" ,levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("IMC: "+imc+" ,Obesidade grau I");
        } else if (imc >= 35.0  && imc <= 39.9) {
            System.out.println("IMC: "+imc+" ,Obesidade grau II (severa)");
        } else{
            System.out.println("IMC: "+imc+" ,Obesidade grau III (mórbida");
        }
    }
}
