package stream.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Resultados  {

    Cliente c1 = new Cliente("Zé", "147", 12, true);
    Cliente c2 = new Cliente("Joaquim", "1010", 26, true);
    Cliente c3 = new Cliente("Yago", "149", 15, true);
    Cliente c4 = new Cliente("Hugo", "141", 5, true);
    Cliente c5 = new Cliente("Tih", "142", 2, false);
    Cliente c6 = new Cliente("Bob", "157", 1, true);
    Cliente c7 = new Cliente("Tonha", "125", 8, true);
    Cliente c8 = new Cliente("Godofredo", "1471", 11, true);
    Cliente c9 = new Cliente("Alberto", "111", 12, true);
    Cliente c10 = new Cliente("Murilo", "101010", 25, true);

    List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);

    public void menorCompra() {
        System.out.println(  clientes.stream().mapToInt(b->b.getCompras()).min() );
    }

    public void maiorCompra(){

        System.out.println(clientes.stream().mapToInt(c->c.getCompras()).max());
    }

    public void media(){
        double media = clientes.stream().mapToDouble(c->c.getCompras()).sum();
        System.out.println("A média é : " + media/clientes.size());
    }


}
