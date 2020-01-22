import java.util.*;
 
 
public class CodeForce{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        
        
        while(q-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int max=Math.max(Math.max(a, b), c);
            
            int sum=Math.abs(max-a)+Math.abs(max-b)+Math.abs(max-c);
            
            sum=n-sum;
            //System.out.println(sum);
            if(sum>=0&&sum%3==0)System.out.println("YES");
            else    System.out.println("NO");
        
        }
        
            
    }
}
 
