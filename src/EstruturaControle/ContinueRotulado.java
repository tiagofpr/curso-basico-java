package EstruturaControle;

public class ContinueRotulado {
    public static void main(String[] args) {
        externo :for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1){
                    continue externo;//caso remova o externo ira continuar o for interno
                }
                System.out.printf("[%d %d]", i ,j);
            }
            System.out.println();
        }
        System.out.println("Fim");
    }
}
