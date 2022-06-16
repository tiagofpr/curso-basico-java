package fundamentos.operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini Desafio...");
        System.out.println(++a == b--);//primeiro vai incrementar no "a" depois compara e só então decrementa no "b" (por isso true)
        System.out.println(a == b);//aqui despois de decrementar ao comparar foi false
        System.out.println(a);
        System.out.println(b);
    }
}
