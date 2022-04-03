package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //informações de funcionarios

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 32767;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //Tipos numéricos reais
        float salario = 11_445.44F;//o java não analisa o valor e sim o tipo, pos isso devo colocar a letra F.
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipos booleano
        boolean estaDeFerias = false; // true

        //Tipo caractere
        char status = 'A'; // ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Número de Viagens
        System.out.println(numerosDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status : " + status);
    }
}
