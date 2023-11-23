package ufc0789_3TIS_1_DANIELRODRIGUES;

public class CDLPCMegaStore {
    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta",1.75);
        Produto p2 = new Produto("Lapis Nº2",0.80);
        Produto p3 = new Produto("Caderno Linhas",4.90);
        Produto p4 = new Produto("Portátil XD PRO",400);

        Item item1 = new Item(p1,10);
        Item item2 = new Item(p2,2);
        Item item3 = new Item(p3,1);
        Item item4 = new Item(p4,1);

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.listaItens.add(item1);
        compra1.listaItens.add(item2);
        compra1.listaItens.add(item3);
        compra2.listaItens.add(item4);

        Cliente cliente1 = new Cliente("Daniel");

        cliente1.listaCompras.add(compra1);
        cliente1.listaCompras.add(compra2);

        System.out.println("O Cliente " + cliente1.nome + " gastou no CDLPC Mega Store: ");



    }
}
