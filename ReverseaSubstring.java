 import java.util.Scanner;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char []a=sc.next().toCharArray();
        boolean tr=false;
        for(int i=1;i<n;i++){
            //System.out.println((int)a[i]+""+(int)a[i-1]);
            if((int)(a[i])<(int)(a[i-1])){
                System.out.println("YES");
                int j=i+1;
                System.out.println(i+" "+j);
                tr=true;
                break;
            }
            
        }
        if(!tr)System.out.println("NO");
        
        
        
        
	}
  
}
 
