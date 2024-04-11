package sample2;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        
        members.put("GK","前川");
        members.put("DF","菅原");
        members.put("MF","守田");
        members.put("FW","上田");

        String fw =members.get("FW");
        System.out.println("FW:" + fw);
        
        
    }

}
