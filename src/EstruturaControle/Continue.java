package EstruturaControle;

public class Continue {
    public static void main(String[] args) {
       //continue interrompe a repetição
        for (int i = 0; i < 10; i ++){
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }

    }
}
