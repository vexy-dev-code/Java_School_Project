package ufc0789_3TIS_1_DANIELRODRIGUES;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> listaCompras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    double obterValorTotal() {
        return listaCompras.size();
    }

}
