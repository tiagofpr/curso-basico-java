package classe.desafio;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Tiago", 59.00);

        Comida c1 = new Comida("Macarrão",0.500);
        Comida c2 = new Comida("Carne", 0.300);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());
    }




}
