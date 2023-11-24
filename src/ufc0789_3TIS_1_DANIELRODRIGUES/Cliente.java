package ufc0789_3TIS_1_DANIELRODRIGUES;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> listaCompras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    double obterValorTotal() {

        double total = 0;
        for (Compra c : listaCompras) {
            total += c.obterValorTotal();
        }
        return total;
    }

}
