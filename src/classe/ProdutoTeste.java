package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto("Caneta Preta",12.56,0.29);

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoDesconto();
        double precoFinal2 = p2.precoDesconto(0.1);
        double mediaCarrinho = (precoFinal1+precoFinal2) / 2 ;
        System.out.printf("Media do carrinho = R$%.2f." , mediaCarrinho);
    }
}
