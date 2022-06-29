package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        //ultimo a entrar é o primeiro a sair
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno Principe");
        livros.push("Don quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for (String livro: livros) {
            System.out.println(livro);
        }

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        //System.out.println(livros.remove());

//        livros.size();
//        livros.clear();
//        livros.contains();
//        livros.isEmpty();


    }
}
