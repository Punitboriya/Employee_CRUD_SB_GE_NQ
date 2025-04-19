package CoreJava;

import java.util.HashMap;

public class HashCodeEqualContract {
    public static void main(String[] args) {

//        HashMap<String,Integer> hm = new HashMap<>();
//        hm.put("Raj",40);
//        hm.put("Jay",30);
//        hm.put("Rk",25);
//        hm.put("Raj",78);
//        System.out.println(hm);

        Integer key1 =10;
        Integer key2 =10;
        Integer key3 =10;

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(key1,"Raj");
        hm.put(key2,"Jay");

        System.out.println(hm.get(key1));
        System.out.println(hm.get(key2));
        System.out.println(hm.get(key3));

        System.out.println(hm);





    }
}
