package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    //criar contrutor de forma explicita
    //contrutor padrão recebe 01/01/1970

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }



    String obterDataFormatada(){//essa é a forma mais usada, retornando o valor
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());//posso fazer usando um metodo chamando outro
    }
}
