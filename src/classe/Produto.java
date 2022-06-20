package classe;

public class Produto {

    //Atributos
    String nome;
    double preco;
    double desconto;

    double precoDesconto(){
        return preco * (1 - desconto);
    }
    double precoDesconto(double descontoGerente){
        return preco * (1 - desconto + descontoGerente);
    }
  }
