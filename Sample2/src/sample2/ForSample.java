package sample2;

import java.util.Iterator;

public class ForSample{
    
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if(i == 10) {
                System.out.println((i*2)+1);
                break;
                
            }
            
            System.out.println(i);
            
        }
        
    }
}
