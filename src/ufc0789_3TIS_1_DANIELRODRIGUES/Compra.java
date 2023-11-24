package ufc0789_3TIS_1_DANIELRODRIGUES;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> listaItens = new ArrayList<>();

    double obterValorTotal() {

        double total = 0;

        for (Item it : listaItens) {
            total += it.quantidade*it.produto.preco;
        }

        return total;
    }

    void adicionarItem(String nome, double preco, int qtd) {
        Produto prod = new Produto(nome,preco);
        this.listaItens.add(new Item(prod,qtd));
    }

}
