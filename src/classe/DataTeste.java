package classe;
public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();//pega as informações por padrão

        Data d2 = new Data(15, 3, 1987);//grava nas variaveis passadas na classe Data

        String dataFormatada1 = d1.obterDataFormatada();//posso fazer passando una vaiável
        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();//aqui ele já chama o println dentro da propria função
        d2.imprimirDataFormatada();
       }
}
