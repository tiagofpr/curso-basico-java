package fundamentos.operadores;

public class OperadorTernario {

    public static void main(String[] args) {

        double media = 5.6;

        String resultado = media >= 7.0 ? "aprovado" : "em recuperação";
        //atribuição condicional.
        System.out.println("O aluno está " + resultado);

        double nota = 7.3;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota > 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultadoFinal = temDesconto ? "Sim." : "Não.";

        System.out.println("Tem desconto ? " + resultadoFinal);
    }
}
