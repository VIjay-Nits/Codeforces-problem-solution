  import java.util.Scanner;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        char[] s=scan.next().toCharArray();
        int flag=0;
        for(int i=0;i<n;i=i+2){
            if(s[i]=='a'&&s[i+1]=='a'||s[i]=='b'&&s[i+1]=='b'){
                s[i]='a';
                s[i+1]='b';
                flag++;
            }
        }
        System.out.println(flag);
        System.out.println(s);
       
            
        
  

  }
    
}
