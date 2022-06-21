package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 1;
        d1.mes = 1;
        d1.ano = 2022;

        Data d2 = new Data();
        d2.dia = 15;
        d2.mes = 3;
        d2.ano = 1987;

        String dataFormatada1 = d1.obterDataFormatada();//posso fazer passando una vaiável
        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();//aqui ele já chama o println dentro da propria função
        d2.imprimirDataFormatada();
       }
}
