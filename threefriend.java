 import java.util.Scanner;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        //TreeSet<Integer>ts=new TreeSet<Integer>();
        while(n-->0){
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();
            int aa=Math.abs(a-b);
            int bb=Math.abs(b-c);
            int cc=Math.abs(a-c);
            a=aa+bb+cc-4;
            if(a>0)System.out.println(a);
            else System.out.println(0);
            
            
        }
        
       
            
        
  

  }
    
}
