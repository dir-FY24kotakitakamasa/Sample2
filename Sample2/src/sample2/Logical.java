package sample2;

public class Logical {
    
    public static void main(String[] args) {
        int score = 59;
        int score2 = 59;
        
        System.out.print("scoreが40以上、かつ50以下：");
        System.out.println(score >= 40 && score <= 50);
        
        System.out.print("scoreが40以上、mataha50以下：");
        System.out.println(score >= 40 || score <= 50);
        
        System.out.print("scoreが40以上denai:");
        System.out.println(score != score2);
        
        System.out.print("scoreが40以上nogyaku:");
        System.out.println(!(score == 40) );
        
        var res1 = score == score2;
        var res2 = score == score2;
        
        
        System.out.println(res1^res2);
        
    }

}
