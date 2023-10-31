package hashMap;

import java.util.HashMap;
import java.util.Map;

public class mainHashMap {

    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("cachorro",1);
        hashMap.put("gato",2);
        hashMap.put("sapo",3);

//        System.out.println("Buscando valor da chave 1: " + hashMap.get(1));

        for(String key : hashMap.keySet()){
            System.out.println(hashMap.get(key) + ": " + key );
        }
    }
}
