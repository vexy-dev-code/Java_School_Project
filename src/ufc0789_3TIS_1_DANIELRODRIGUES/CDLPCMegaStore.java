package ufc0789_3TIS_1_DANIELRODRIGUES;

public class CDLPCMegaStore {
    public static void main(String[] args) {

        /* Criar os produtos */

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.adicionarItem("Caneta",1.75,10);
        compra1.adicionarItem("Lapis Nº2",0.80,2);
        compra1.adicionarItem("Caderno Linhas",4.90,1);
        compra2.adicionarItem("Portátil XD PRO",400,1);

        Cliente cliente1 = new Cliente("Daniel");

        cliente1.listaCompras.add(compra1);
        cliente1.listaCompras.add(compra2);

        System.out.printf("O Cliente " + cliente1.nome + " gastou no CDLPC Mega Store: " + cliente1.obterValorTotal() + "€");
    }
}
