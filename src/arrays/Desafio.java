package arrays;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a quantidade de notas: ");
        int qdtNnotas = entrada.nextInt();

        double[] notas = new double[qdtNnotas];

        for (int i = 0; i < notas.length; i++){
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }
        //somar as notas
        double total = 0;
        for (double nota: notas) {
            total += nota;
        }
        //calculando a media
        double  media = total / notas.length;
        System.out.println("A média é "+ media + "!");

        entrada.close();
    }

}
