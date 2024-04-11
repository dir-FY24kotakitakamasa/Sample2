package sample2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setQueue {
    public static void main(String[] args) {
        List<String>memberS = new ArrayList<>();
        
        memberS.add("kotaki");
        memberS.add("kakeru");
        memberS.add("ryuji");
        memberS.add("naoki");
        memberS.add("kotaki");
        
        memberS.stream()
            .sorted()
            .forEach(num->System.out.println(num));
        
        System.out.println(" ");
        
        String me = memberS.get(3);
        System.out.println(me);
        
        
        
    }
}
