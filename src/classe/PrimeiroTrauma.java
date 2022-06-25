package classe;

public class PrimeiroTrauma {

    static int a = 3; //não pode mexer nessa linha
    static int b = 4;

    public static void main(String[] args) {

        //tentar arrumar esse codigo, sem mexer na linha antes do metodo.
        //pode mexer dentro do metodo main
        primeiroTrauma(a);
        System.out.println(a);

        //forma mais facil, mudar a variavel b para static
        System.out.println(b);
   }
    static void primeiroTrauma(int a) {

    }

}
/* Minha Resposta:
criado um metodo estatico para fora do metodo main e alterado a variavel int para
"static", chamado o metodo dentro do main passando a variavel
 */