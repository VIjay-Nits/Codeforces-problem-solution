
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution{
    public static void
         main(String [] args)throws IOException{
             
        Scanner dede=new Scanner(System.in);
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int t=dede.nextInt();
          while(t-->0){
              int n=dede.nextInt();
              int sum=0;
              int s_count=0;
              int m_count=0;
              int min=105;
              
              int []a=new int[n];
              for(int i=0;i<n;i++){
                  a[i]=dede.nextInt();
                  if(a[i]==0){m_count++;a[i]++;}
                  sum=sum+a[i];
                  
                  
              }
             // sum=sum-a[m_count];
              if(sum==0)m_count++;
              System.out.println(m_count);
              
              
              
              
          }
         
         }
}
