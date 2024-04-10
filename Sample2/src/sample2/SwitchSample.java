package sample2;

public class SwitchSample {

    public static void main(String[] args) {
        int score = 5;
        
        switch (score/10) {
        case 10 -> System.out.println("100dai");
        case 9 -> System.out.println("90dai");
        case 8 -> System.out.println("80dai");
        default -> System.out.println("uhhyaaa");
        }
        

    }

}
