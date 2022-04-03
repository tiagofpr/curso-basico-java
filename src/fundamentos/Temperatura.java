package fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){
        //(ºF - 32) * 5/9 = ºC
        final double FATOR = 5/9.0;
        final double AJUSTE = 32;
        double valor;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "ºC.");

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "ºC.");

        //Entrada de dados via console.
        Scanner temp = new Scanner(System.in);

            System.out.println("Digite o valor a ser convertido : ");
            valor = temp.nextDouble();
            double c = (valor - AJUSTE) * FATOR;
            System.out.println("O resultado é " + c + "ºC.");
        }


    }

