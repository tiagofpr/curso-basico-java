package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoConportado {

    public static void main(String[] args) {

        //Set<String> listaAprovado = new HashSet<>();
        SortedSet<String> listaAprovado = new TreeSet<>();
        listaAprovado.add("Tiago");
        listaAprovado.add("Ana");
        listaAprovado.add("Luca");
        listaAprovado.add("Pedro");

        for(String candidato: listaAprovado){
            System.out.println(listaAprovado);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(60);
        for (int n: nums){
            System.out.println(n);
        }

    }
}
