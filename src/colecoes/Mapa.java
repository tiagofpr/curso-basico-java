package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuario = new HashMap<>();
        usuario.put(1, "Roberto");
        usuario.put(2, "Ricardo");
        usuario.put(20, "Rafaela");
        usuario.put(4, "Rebeca");

        System.out.println("Tamanho: " + usuario.size());
        System.out.println("Está vazio? "+ usuario.isEmpty());

        System.out.println("Traz a chave -> "+ usuario.keySet());
        System.out.println("Traz o valor -> "+ usuario.values());
        System.out.println("Entrada -> "+ usuario.entrySet());

        System.out.println("Tem a chave 20? " + usuario.containsKey(20));
        System.out.println("Tem o nome Rebeca? "+ usuario.containsValue("Rebeca"));

        System.out.println("Traz usuario > " + usuario.get(20));
        System.out.println("Remove usuario > "+ usuario.remove(1));

        for (int chave: usuario.keySet()){
            System.out.println("Chave: "+ chave);
        }
        for (String valor: usuario.values()){
            System.out.println("Valor: "+ valor);
        }
        for (Map.Entry<Integer, String> registro: usuario.entrySet()){
            System.out.print("Chave-> "+ registro.getKey());
            System.out.println(" Usuário-> " +registro.getValue());
        }
    }
}
