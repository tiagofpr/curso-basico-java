package EstruturaControle;

public class For1 {
    public static void main(String[] args) {


        for (int contador = 1; contador <=20; contador++){
            System.out.printf("i = %d\n" ,contador);
        }
        //caso queira não precisa informar todas as expressões
        int x =2;
        for ( ; x >10; ){//aqui não foi definido o inicio nem o fim da expressão
            System.out.println("x = " + x);
            x++;
        }
        //criar laço infinito com for
        for (; ;) {
            System.out.println("Fim");
        }

        }

    }

