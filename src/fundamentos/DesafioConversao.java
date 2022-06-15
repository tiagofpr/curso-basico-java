package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        //3 string usando nextLine
        //ultimos 3 salario de um funcionario
        //calcular a media dos ultimos 3 salario
        //deve poder separa as casas decimais por "," ou "."
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor primeiro Salário: ");
        String salario1 = entrada.next().replace(",", ".");

        System.out.println("Digite o valor segundo Salário: ");
        String salario2 = entrada.next().replace(",", ".");

        System.out.println("Digite o valor do terceiro Salário: ");
        String salario3 = entrada.next().replace(",", ".");

        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        //double media = (salario1 + salario2 + salario3) / 3;

        //System.out.println("A media dos salarios é :" + media);
        entrada.close();


    }
}
