package CoreJava;

import java.util.HashMap;
import java.util.HashSet;

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
        System.out.println("-------------------------------------");

        Voter v1 = new Voter(1,"Punit");
        Voter v2 = new Voter(1,"Punit");
        Voter v3 = new Voter(1,"Punit");
        System.out.println(v1.equals(v3));
        System.out.println(v1== v3);


//        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//        Integer a = 555;
//        Integer b = 555;
//        System.out.println(a.equals(b));
//        System.out.println(a==b);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Integer a = 55;
        Integer b = 55;
        System.out.println(a.equals(b));
        System.out.println(a==b);

        System.out.println("******************************************");
        HashSet<Voter> hs = new HashSet<>();
        hs.add(v1);
        hs.add(v2);
        hs.add(v3);
        System.out.println(hs);




    }
}
