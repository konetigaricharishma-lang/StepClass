import java.util.Arrays;

public class S5Q1 {
    public static void curveScore(int[] scores, int bonus){
        for(int i=0;i<scores.length;i++){
            scores[i] = scores[i]+bonus;
        }    
    }  
    public static void main(String[] args){
        int[] scores = {70,85,60};
        curveScore(scores, 10);
        System.out.println(Arrays.toString(scores));
    } 
}
