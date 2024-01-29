import java.util.*;

public class MySet {
    public static void main(String[] args) {
        Set<String> grupo1, grupo2;

        grupo1 = new HashSet<String>();
        grupo2 = new TreeSet<String>();

        String nome1 = "Ana";
        String nome2 = "Maria";
        String nome3 = "Rodrigo";
        String nome4 = "João";
        String nome5 = "Beatriz";

        grupo1.add(nome1);
        grupo1.add(nome2);
        grupo1.add(nome3);
        grupo1.add(nome4);
        grupo1.add(nome5);

        grupo2.add(nome1);
        grupo2.add(nome2);
        grupo2.add(nome3);
        grupo2.add(nome4);
        grupo2.add(nome5);

        System.out.println("HashSet (grupo1): " + grupo1);
        System.out.println("TreeSet (grupo2): " + grupo2);
    }
}