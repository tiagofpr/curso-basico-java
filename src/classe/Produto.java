package classe;

public class Produto {

    //Atributos
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto (){ //contrutor sem passar nenhum parametro
    }
    Produto (String nomeInicial){//contrutor de forma explicita
        nome = nomeInicial;
    }
    Produto(String nomeInicial, double precoInicial){ //contrutor com todos os parametros
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoDesconto(){

        return preco * (1 - desconto);
    }
    double precoDesconto(double descontoGerente){
        return preco * (1 - desconto + descontoGerente);
    }
  }
/*
Nome da loga "25%deDesconto"
todos os produtos estão com o desconto de 25%


 */