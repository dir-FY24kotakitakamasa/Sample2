package sample2;

import java.util.ArrayList;
import java.util.List;

public class StreamSample {

    public static void main(String[] args) {
        List<String>places = new ArrayList<>();
        
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");
        
        System.out.println("stream forEach");
        places.stream().forEach(place->System.out.println(place));

        
        System.out.println("endwith");
        places.stream()
            .filter(place->place.endsWith("ン"))
            .forEach(place->System.out.println(place));
        
        System.out.println("length");
        places.stream()
            .map(place->place + "nonagasaha..." + place.length())
            .forEach(place->System.out.println(place));
        
        System.out.println("sort");
        places.stream()
            .sorted()
            .forEach(place->System.out.println(place));
        
        System.out.println("filter");
        places.stream()
            .filter(place->place.contains("ス"))
            .forEach(place->System.out.println(place));
    }

}
