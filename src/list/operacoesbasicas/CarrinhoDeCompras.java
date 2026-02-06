package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        itens.removeIf(item ->
                item.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }

        return total;
    }

    public void exibirItens() {
        for (Item item : itens) {
            System.out.println(
                    item.getNome() +
                            " | Preço: " + item.getPreco() +
                            " | Quantidade: " + item.getQuantidade()
            );
        }
    }
}
