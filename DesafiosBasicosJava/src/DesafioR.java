public class DesafioR {
    public static void main(String[] args) {
        /*Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m
        e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em
        quantos anos serão necessários para que Francisco seja maior que Sara.*/


        int alturaFrancisco = 150;
        int alturaSara = 110;
        int anos = 0;
        while (alturaSara <= alturaFrancisco) {
            alturaFrancisco += 2;
            alturaSara += 3;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Sara seja mais alta que Francisco.");
    }
}
