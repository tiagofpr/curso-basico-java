package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    String obterDataFormatada(){//essa é a forma mais usada, retornando o valor
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());//posso fazer usando um metodo chamando outro
    }
}
