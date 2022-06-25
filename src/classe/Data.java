package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    //criar contrutor de forma explicita
    //contrutor padrão recebe 01/01/1970

    Data(){
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1,1,1970); //posso fazer dessa forma chamar o this como um metodo para chamar um construtor
    }
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        //aqui geralmente é usado para resolver conflito de nomes
    }
    String obterDataFormatada(){//essa é a forma mais usada, retornando o valor
        return String.format("%d/%d/%d", this.dia, mes, ano);//pode usar o thi diretamente no metodo
    }
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());//posso fazer usando um metodo chamando outro
    }
}
