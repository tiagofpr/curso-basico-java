package classe;

public class Produto {

    //Atributos
    String nome;
    double preco;
    double desconto;

    Produto (){ //contrutor sem passar nenhum parametro
    }
    Produto (String nomeInicial){//contrutor de forma explicita
        nome = nomeInicial;
    }
    Produto(String nomeInicial, double precoInicial, double descontoInicial){//contrutor com todos os parametros
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoDesconto(){
        return preco * (1 - desconto);
    }
    double precoDesconto(double descontoGerente){
        return preco * (1 - desconto + descontoGerente);
    }
  }
