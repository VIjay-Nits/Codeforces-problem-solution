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

public class Solution{
    public static void
         main(String [] args)throws IOException{
             
         Scanner sc=new Scanner(System.in);
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=sc.nextInt();
         while(t-->0){
             int spent=0;
             int n=sc.nextInt();
             int rest=0;
             while(n/10>0){
              rest=n%10;
              spent=spent+(n/10)*10;
             n=rest+(n/10);
             }
             System.out.println(spent+n);
         
         
         }
         
         }
         
    
}

                
