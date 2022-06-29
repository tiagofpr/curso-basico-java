package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //offer e add -> adiciona elementos na fila
        //Diferença é o comportamento quando a fila está cheia
        fila.add("Ana");//retorna um erro caso não consiga adicionar
        fila.offer("Bia");//retorna falso caso não condiga adicionar
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //peek e Element -> obter o proximo elemento da fila sem remover
        //Diferença é o comportamento, ocorre quando a fila está vazia
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();

        //poll e Remove -> obter o proximo elemento da fila

        //Diferença é o comportamento quando a fila está vazia
        System.out.println(fila.poll());//retorna null
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());//quando a fila está vazia da erro


    }
}
