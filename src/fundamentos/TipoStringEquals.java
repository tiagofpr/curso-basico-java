package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2" == "2");
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();
        System.out.println("2" == s2.trim());// .trim tira os espaços em branco
        System.out.println("2".equals(s2));//quando for comprar String usar o equals

        entrada.close();
    }
}
