package list.operacoesbasicas;

public class MainCarrinho {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Livro", 50.0, 2);
        carrinho.adicionarItem("Caderno", 15.0, 3);
        carrinho.adicionarItem("Caneta", 2.5, 5);

        System.out.println("=== ITENS NO CARRINHO ===");
        carrinho.exibirItens();

        System.out.println("\nValor total: R$ " +
                carrinho.calcularValorTotal());

        carrinho.removerItem("Caderno");

        System.out.println("\nApós remover um item:");
        carrinho.exibirItens();
    }
}
