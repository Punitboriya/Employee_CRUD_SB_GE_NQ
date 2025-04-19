package CoreJava;

import java.util.HashMap;

public class VoterTest {
    public static void main(String[] args) {
        Voter key1 = new Voter(101,"Raj");
        Voter key2 = new Voter(101,"Raj");
        Voter key3 = new Voter(101,"Raj");

        HashMap<Voter,Integer> hm = new HashMap<>();
        hm.put(key1,20);
        hm.put(key2,40);

        System.out.println(hm.get(key1));
        System.out.println(hm.get(key2));

        System.out.println(hm);

    }
}
