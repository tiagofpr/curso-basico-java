package colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {

    public static void main(String[] args) {


        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true);//boolean -> Boolean
        conjunto.add("Teste");//String
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é:"+ conjunto.size());

        conjunto.add("Teste");//não aceita duplicados
        conjunto.add('x');
        System.out.println("Tamanho é: "+ conjunto.size());//tamanho continua 5

        System.out.println(conjunto.remove("teste"));//false pq não tem esse objeto
        System.out.println(conjunto.remove("Teste"));//true pq encontrou o objeto
        System.out.println(conjunto.remove('x'));//true pq encontrou o objeto

        System.out.println("Tamanho é: "+ conjunto.size());

        System.out.println(conjunto.contains('X')); //false pois foi removido
        System.out.println(conjunto.contains(1)); //true pois não foi removido
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums);//união entr dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }

}
