import java.util.*;
 
 
public class CodeForce{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        
        while(t-->0){
            int n=sc.nextInt();
            int Y=n;
            int i=0,j=0;
            for( i=2;i<Math.ceil(Math.cbrt(n));i++){
                if(n%i==0){
                    n=n/i;
                    break;
                }
                
            }
            for( j=i+1;j<Math.ceil(Math.sqrt(n));j++){
                if(n%j==0){
                    n=n/j;
                    break;
                }
                
        }
            if(n!=i&&i!=j&&n!=j&&n*i*j==Y){System.out.println("YES");System.out.println(i+" "+j+" "+n);}
            else System.out.println("NO");
        
            
    }
    }
}
 
 
