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
         int t=Integer.parseInt(br.readLine());
         while(t-->0){
             int n=Integer.parseInt(br.readLine());
             StringBuilder s=new StringBuilder("");
             if(n%2==0){
                 for(int i=0;i<n;i=i+2)s.append("1");
             }
             else {
                 s.append("7");
                 n=n-3;
                 for(int i=0;i<n;i=i+2)s.append("1");
             }
             System.out.println(s);
         
         }
         
         
         }
         }
         
         
         
         
         
         
         
         


