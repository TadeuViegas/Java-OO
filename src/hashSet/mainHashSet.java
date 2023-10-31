package hashSet;

import java.util.HashSet;
import java.util.Set;

public class mainHashSet {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("maça");
        hashSet.add("banana");
        hashSet.add("bacate");
        hashSet.add("maça");

        hashSet.forEach(System.out::println);

        System.out.println("Existe banana no conjuntos? " + hashSet.contains("banana"));

        hashSet.remove("bacate");
        hashSet.forEach(System.out::println);

        System.out.println(hashSet.size());

        hashSet.forEach(System.out::println);
        hashSet.clear();
        hashSet.forEach(System.out::println);






    }
}
