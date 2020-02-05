/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package solution;

/**
 *
 * @author Vijay
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Solution{
    public static void
         main(String [] args)throws IOException{
             
         Scanner sc=new Scanner(System.in);
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=sc.nextInt();
         while(t-->0){
             int n=sc.nextInt();
             char[]c=sc.next().toCharArray();
             HashMap<Long,Integer>hm=new HashMap<>();
             long l=10000000L;
             hm.put(0*l+0, 0);
             int x=0;
             int y=0;
             int left=-1;
             int right=-1;
             int min=Integer.MAX_VALUE;
             for(int i=0;i<n;i++){
                 if (c[i] == 'L')x--;
                 else if(c[i]=='R')x++;
                 else if(c[i]=='U')y++;
                 else if(c[i]=='D') y--;
                 
                 long temp=x*l+y;
                 if(hm.containsKey(temp)){
                     int length=i-hm.get(temp);
                     if(length<min)
                         {
                         left=hm.get(temp)+1;
                        right=i+1;
                        min=length;
                 }
                 }
                 
                 hm.put(temp, i+1);
                 //System.out.println(temp+""+i);
				
                 }
             if(left!=-1)System.out.println(left+" "+right);else System.out.println("-1");
              
         
         
         }
         
         
         }
         
         
    
}

                
