package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia x";
        s = s.toUpperCase();//metodo que converte para letras maiusculas
        s = s.replace("X" , "Senhora");//metodo que substitui uma palavra
        s = s.concat("!!!");//metodo que concatena
        System.out.println(s);

        String x = "Tiago".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X" , "GUI")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        //Tipos primtivos não tem o operador "."
        int a = 3;
        System.out.println(a);


    }
}
