package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //atribuição por valor

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(25,6,2022);
        Data d2 = d1; //atribuição por referencia (Objeto)

        d1.dia = 31;
        d1.mes = 12;

        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c =5;
        alterarPrimitivo(c);
        System.out.println(c);
        System.out.println(a);

    }

    //metrodo estático. um metodo estatico só pode acessar un outro metodo estatico

    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    //Usar esse tipo de metodo com cuidado pois não é certo mexer nos atributos que recebeu como parametros.
    }

    static void alterarPrimitivo (int a){
        a++;
    //aqui foi gerado uma copia em outro local na memoria por isso não afeta o valor do "c"
    }
}
