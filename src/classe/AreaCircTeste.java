package classe;

public class AreaCircTeste {

    public static void main(String[] args) {

        //AreaCirc.pi = 3.1415;

        AreaCirc a1 = new AreaCirc(10);
        a1.raio = 10;
        //a1.pi = 10;


        System.out.println(a1.area());

        //AreaCirc a2 = new AreaCirc(5);
        //a2.pi = 5;


        System.out.println(AreaCirc.area(100));
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
