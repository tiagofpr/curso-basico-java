package fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //ler num1
        //ler num2
        //+ - * / %

        Scanner entrada = new Scanner(System.in);
        System.out.println("##### Calculadora Udemy #######");
        System.out.println("Você pode usar as seguintes operações:");
        System.out.println("+ para somar.\n- para subtrair \n* para multiplicar\n/ para dividir\n% para modulo");
        System.out.println("-------Vamos começar-------- ");
        System.out.println("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite o simbolo da operação desejada: ");
        String simbolo = entrada.next();

        //Usando operadores ternarios
        double resultado = "+".equals(simbolo) ? num1 + num2 :0;
        resultado = "-".equals(simbolo) ? num1 - num2 : resultado;
        resultado = "*".equals(simbolo) ? num1 * num2 : resultado;
        resultado = "/".equals(simbolo) ? num1 / num2 : resultado;
        resultado = "%".equals(simbolo) ? num1 % num2 : resultado;
        System.out.printf("%.2f %s %.2f = %.2f", num1 , simbolo, num2, resultado);

        entrada.close();


        /*
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
        String simbolo = JOptionPane.showInputDialog("Digite o segundo numero: ");

        //logica
        double resultado = "+".equals(simbolo) ? num1 + num2 :0;
        resultado = "-".equals(simbolo) ? num1 - num2 : resultado;
        resultado = "*".equals(simbolo) ? num1 * num2 : resultado;
        resultado = "/".equals(simbolo) ? num1 / num2 : resultado;
        resultado = "%".equals(simbolo) ? num1 % num2 : resultado;
        System.out.printf("%2.f %s %2.f = %2.f", num1 , simbolo, num2, resultado);
        */
    }
}
