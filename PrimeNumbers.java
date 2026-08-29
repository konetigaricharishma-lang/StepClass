import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        boolean isPrime = true;
for(int i=2;i<num;i++){
    if(num%1==0){
        isPrime=false;
        break;
    }
}
System.out.println("Is the number "+ num +" a Prime Number?"+isPrime);
    }
}
