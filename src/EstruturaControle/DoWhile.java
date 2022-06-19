package EstruturaControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        //if (...) sentença; ou {}
        //while (...) sentença; ou {}
        //for (...;...;...) sentença; ou {}

        //do {} while (...);//sentença fica antes da espressão e termina com ";"
        Scanner entrada = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Você precisa falar as palavara mágicas...");
            System.out.print("Quer sair?");
            texto = entrada.nextLine();
        }while (!texto.equalsIgnoreCase("por favor"));
        System.out.println("Obrigado!");
        entrada.close();

    }
}
