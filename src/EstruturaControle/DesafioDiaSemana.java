package EstruturaControle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da Semana: ");
        String dia = entrada.next();

        if (dia.equalsIgnoreCase("Domingo")){
            System.out.println("Domingo equivale ao: \"1\"");
        } else if (dia.equalsIgnoreCase("Segunda")){
            System.out.println("Segunda equivale ao: \"2\"");
        } else if (dia.equalsIgnoreCase("Terça") || (dia.equalsIgnoreCase("Terca"))){
            System.out.println("Terça equivale ao: \"3\"");
        } else if (dia.equalsIgnoreCase("Quarta")){
            System.out.println("Quarta equivale ao: \"4\"");
        } else if (dia.equalsIgnoreCase("Quinta")){
            System.out.println("Quinta equivale ao: \"5\"");
        } else if (dia.equalsIgnoreCase("Sexta")){
            System.out.println("Sexta equivale ao: \"6\"");
        } else if (dia.equalsIgnoreCase("Sábado")|| (dia.equalsIgnoreCase("sabado"))){
            System.out.println("Sábado equivale ao: \"7\"");
        } else {
            System.out.println("Dia inválido!");
        }
        entrada.close();
    }
}
