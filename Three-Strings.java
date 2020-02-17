
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution{
    public static void
        main(String [] args)throws IOException{
             
         Scanner jldi=new Scanner(System.in);
         //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=jldi.nextInt();
         ll:while(t-->0){
            String a=jldi.next();
            String b=jldi.next();
            String c=jldi.next();
            boolean flag=true;
            
            ul:for(int i=0;i<a.length();i++){
                if(a.charAt(i)==c.charAt(i)||b.charAt(i)==c.charAt(i)){
                    
                }
                else{
                    System.out.println("NO");
                    flag=false;
                    break ul;
                }
            }
            if(flag)System.out.println("YES");
             
             
         }
         }
}
