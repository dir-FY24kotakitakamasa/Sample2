package sample2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
    
    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");
        
        String firstItem = places.get(0);
        System.out.println("1番目（前）" + firstItem);
        
        places.set(0, "スウェーデン");
        System.out.println("1番目（跡）" + places.get(0));
        
        System.out.println("2番目（前）" + places.get(1));
        places.remove(1);
        System.out.println("2番目（後）" + places.get(1));
        
        System.out.println("拡張ループで取得：");
        for (String place: places) {
            System.out.println(place);
        }
        
        System.out.println("forEace");
        places.forEach((place) -> System.out.println(place));
        
        
        int size = places.size();
        System.out.println("before clear size" + size);
        places.clear();
        System.out.println("after clear size" + places.size());

    
    }

}
