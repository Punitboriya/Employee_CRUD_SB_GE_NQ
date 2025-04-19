package CoreJava;

import java.util.HashMap;

public class HashCodeEqualContract {
    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Raj",40);
        hm.put("Jay",30);
        hm.put("Rk",25);
        hm.put("Raj",78);
        System.out.println(hm);


    }
}
