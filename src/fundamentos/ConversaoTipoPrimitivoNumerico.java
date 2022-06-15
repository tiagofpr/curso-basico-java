package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1;// conversão implicita
        System.out.println(a);

        //Cast
        float b = (float) 1.123456788888888;//conversão explicita
        System.out.println(b);//com valores muitos grandes podem perder informação

        int c = 4;
        byte d = (byte) c;
        System.out.println(d); // tomar cuidado ao realizar a conversão explicita, para não converter valores errados

        double e = 1.9999;//aqui houve perca de informações nesse caso ao fazer a conversão explicita
        int f = (int) e;
        System.out.println(f);
    }
}
