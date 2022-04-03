package fundamentos;

public class Inferencia {

    public static void main(String [] args){
       double a = 4.5;
        System.out.println(a);
        var b = 4.5; //aqui o ava vai inferir conforme o valor atribuido a variavel (double)
        System.out.println(b);

        var c = "Texto"; //aqui o ava vai inferir conforme o valor atribuido a variavel (String)
        System.out.println(c);
        c = "Outro Texto";
        System.out.println(c);
        //c = 4.5; //não posso utilizar a variavel c para tipo double.

        double d;//variavel declarada
        d = 123.65;//variavel incializada
        System.out.println(d);//usada

        //var e; // não poso declara a variavel numa linha e inicializar em outra
        var e = 123.65;//posso declarar e inicializar na mesma linha.

        var f = 12;//não posso declarar como inteiro e inicializar com casas decimais.
        //f = 12.01;
    }

}
