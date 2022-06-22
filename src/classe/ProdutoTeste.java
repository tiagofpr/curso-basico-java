package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;
        //p2.desconto = 0.50;//nesse cenario vc altera o desconto em todos os produtos, pq vc está acessando
                           //o desconto a partir da classe

        System.out.println(p1.nome + ": R$" + p1.precoDesconto());
        System.out.println(p2.nome + ": R$" + p1.precoDesconto());

        double precoFinal1 = p1.precoDesconto();
        double precoFinal2 = p2.precoDesconto(0.1);
        double mediaCarrinho = (precoFinal1+precoFinal2) / 2 ;

        System.out.printf("Media do carrinho:  R$%.2f." , mediaCarrinho);
    }
}
