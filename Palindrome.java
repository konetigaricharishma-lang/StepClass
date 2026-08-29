import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num = n;
        int reversednum=0;
        while(n!=0){
            int digit =n%10;
            reversednum=reversednum*10+digit;
            n = n/10;
        }
        System.out.print("Is the number "+ num +" a Palindrome?");
        if(reversednum==num){
            System.out.print("Yes");
        }
        else{
            System.out.print("N0");
        }
    }
}
