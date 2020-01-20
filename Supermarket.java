  import java.util.Scanner;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        TreeSet<Float>ts=new TreeSet<Float>();
        while(n-->0){
            Float a=scan.nextFloat();
            Float b=scan.nextFloat();
            ts.add(a/b);
            
        }
        System.out.println(ts.first()*m);
       
            
        
  

  }
    
}
