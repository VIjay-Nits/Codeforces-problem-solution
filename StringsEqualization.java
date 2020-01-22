 import java.util.Scanner;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        
        while(n-->0){
            boolean  boo=false;
            char[] a=scan.next().toCharArray();
            char[] b=scan.next().toCharArray();
            TreeSet<Character>ta=new TreeSet<Character>();
            TreeSet<Character>tb=new TreeSet<Character>();
            for(int i=0;i<a.length;i++){
                ta.add(a[i]);
                
            }
            for(int i=0;i<b.length;i++){
                tb.add(b[i]);
            }
            for(Character i:ta){
                if(tb.contains(i)){boo=true;break;}
            }
            if(boo)System.out.println("YES");else System.out.println("No");
        }

  }
    
}
