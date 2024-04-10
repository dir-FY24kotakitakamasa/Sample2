package sample2;

import javax.naming.spi.DirStateFactory.Result;

public class MethodSample {

    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 10;
        
        sumMethod1(number1, number2);
        
        
        var result2 = sumMethod2(number1, number2);
        System.out.println(result2);
        
    }
    
    public static void sumMethod1(int nuu1, int nuu2) {
        var result1 = nuu1 + nuu2;
        System.out.println(result1);
        
    }
    
    public static int sumMethod2(int rrrr, int tttt) {
        int result2 = rrrr*2 + tttt;
        return result2;
        
    }

}
