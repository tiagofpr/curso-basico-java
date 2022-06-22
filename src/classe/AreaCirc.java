package classe;

public class AreaCirc {

    double  raio;
    static final double PI = 3.14; //colocando o sattic pertence a classe e não as instancias

    AreaCirc(double raioInicial){
       raio = raioInicial;
    }
      double area(){
        return PI * Math.pow(raio, 2);
    }
    static double area( double raio){
        //return PI * raio * raio;
        return PI * Math.pow(raio, 2);

    }

}
