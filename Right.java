import java.util.*;
public class Right{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int exp=a/(int)Math.pow(2,b);
        System.out.println(exp); 
    }
}