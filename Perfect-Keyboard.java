
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
             String s=jldi.next();
             int index=0;
             String key="";
             boolean flag=true;
             int []a=new int [26];
             ul: for(int i=0;i<s.length();i++){
                 if(a[s.charAt(i)-97]==0){
                    a[s.charAt(i)-97]=11;
                    if(index==0){
                        key=s.charAt(i)+key;
                        index=0;
                    }
                    else if(index==key.length()-1){
                        key=key+s.charAt(i);
                        index++;
                    }
                    else{
                        
                        flag=false;
                    }
                 }
                 else{
                     if(index==0){
                         if(s.charAt(i)==key.charAt(index+1)){
                            index++; 
                         }
                         else{flag=false;}
                     }
                     else if(index==key.length()-1){
                         if(s.charAt(i)==key.charAt(index-1)){
                            index--;
                         }
                         else{flag=false;}
                     }
                     else if(s.charAt(i)==key.charAt(index-1)){
                         index--;
                         
                     }
                     else if(s.charAt(i)==key.charAt(index+1)){
                         index++;
                     }
                     else{
                         flag=false;
                         break ul;
                     }
                     
                 }
             }
             if(flag){
                 System.out.println("YES");
                 for(int i=0;i<26;i++){
                     if(a[i]==0){
                         char ch=(char)(i+97);
                         
                         key+=ch;
                     }
                 }
                 System.out.println(key);
             }
             else{
                 System.out.println("NO");
             }
         }
         }
}
