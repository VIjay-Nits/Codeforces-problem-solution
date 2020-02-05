/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package solution;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;

public class Solution {
    
 
    public static void
         main(String []args) throws IOException{
        
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
          //    InputReader uu=new InputReader(System.in);
         //int t=Integer.parseInt(br.readLine().trim());
         Scanner sc=new Scanner(System.in);
         
         int n=sc.nextInt();
         int sum=0;
         int[]a=new int[n+1];
         for(int i=1;i<n+1;i++){
             a[i]=sc.nextInt();
             sum+=a[i];
         }
         
         int major=sum/2 +1;
         int count=1;
         boolean flag=false;
         String s="1 ";
         int new_sum=a[1];
         if(a[1]>=major){
             System.out.println("1");
             System.out.println("1");
         }
         else{
             for(int i=2;i<n+1;i++){
                 if(a[1]>=2*a[i]){
                     new_sum+=a[i];
                     count++;
                     s=s+i+" ";
                     
                 }
                 if(new_sum>=major){
                     flag =true;
                     break;
                 }
             }
             if(flag){
                 System.out.println(count);
                 System.out.println(s);
             }
             else{
                 System.out.println("0");
             }
             
         }
         
         
                    
         
         
         }
    
    
}

                
