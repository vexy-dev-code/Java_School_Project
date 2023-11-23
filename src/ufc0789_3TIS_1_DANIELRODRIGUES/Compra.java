package ufc0789_3TIS_1_DANIELRODRIGUES;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> listaItens = new ArrayList<>();

    /*void adicionarItem(String produto,double preco, int quantidade) {
        Produto newProduct = new Produto(produto,preco);
        Item newItem = new Item(newProduct,quantidade);
    }*/

    double obterValorTotal() {
        return listaItens.size();
    }

}
