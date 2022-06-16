package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); //and
        System.out.println(condicao1 || condicao2); //or
        System.out.println(condicao1 ^ condicao2); //xor - ou excluvivo
        System.out.println(!condicao1); //negação
        System.out.println(!condicao2);//negação
        System.out.println(!!condicao2);//dupla negação

        System.out.println("Tabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nTabela verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela verdade Não (NOT)");
        System.out.println(!true );
        System.out.println(!false);

    }
}
