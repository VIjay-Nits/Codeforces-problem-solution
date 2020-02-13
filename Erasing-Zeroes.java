
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
             
         Scanner dede=new Scanner(System.in);
         //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=dede.nextInt();
         while(t-->0){
         char[]ch=dede.next().toCharArray();
         int n=ch.length;
         int left=-1;
         int right=-1;
         for(int i=0;i<n;i++){
             if(ch[i]=='1'){left=i;break;}
         }
         for(int i=n-1;i>=0;i--){
             if(ch[i]=='1'){right=i;break;}
         }
         int zer=0;
         for(int i=left;i<=right&&left>=0&&right<=n-1;i++){
             if(ch[i]=='0')zer++;
         }
         System.out.println(zer);
         
         
         
         }
         }
         
         
         
         
         

}
