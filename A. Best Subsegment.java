
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class Solution{
       
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
                int max=0;
                int inddex=0;
                int count=1;
                int fial=0;
                int[]a=new int[n];
                for(int i=0;i<n;i++){
                    a[i]=s.nextInt();
                    if(a[i]>max){max=a[i];}
                    
                    
                }
                for(int i=0;i<n;i++){
                    count=0;
                    if(a[i]==max){
                        for(;i<n;i++){
                            
                            if(max==a[i])count++;
                            else {
                               
                            break;}
                        }
                        fial=Math.max(fial, count);
                        
                    }
                   
                }
                System.out.println(fial);
                
   	}     
         
}
