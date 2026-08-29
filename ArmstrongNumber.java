import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalnum=num;
        int sum=0;
        while(num!=0){
            int digit = num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        System.out.print("Is the number "+ originalnum +"an Amstrong number?" ); 
        if(sum==originalnum){
            System.out.print(" Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
