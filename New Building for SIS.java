
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
                int h=s.nextInt();
                int a=s.nextInt();
                int b=s.nextInt();
                int k=s.nextInt();
                while(k-->0){
                    int ta=s.nextInt();
                    int fa=s.nextInt();
                    int tb=s.nextInt();
                    int fb=s.nextInt();
                    if(ta==tb)System.out.println(Math.abs(fa-fb));
                    else {
                        if(fa>=a&&fa<=b){
                            System.out.println(Math.abs(ta-tb)+Math.abs(fa-fb)); 
                        }
                        else if(fa<a){
                            System.out.println(Math.abs(a-fa)+Math.abs(ta-tb)+Math.abs(a-fb));
                        }
                        else{
                            System.out.println(Math.abs(b-fa)+Math.abs(ta-tb)+Math.abs(b-fb));
                        }
                        
                    }
                    
                }
                 
   	}     
}
         
   
