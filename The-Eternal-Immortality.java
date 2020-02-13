import java.io.PrintWriter;
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
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import jdk.nashorn.internal.codegen.CompilerConstants;
import java.math.BigInteger;

public class Solution{
    public static void
         main(String [] args)throws IOException{
             
        Scanner sc=new Scanner(System.in);
         //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           long a=sc.nextLong();
           long b=sc.nextLong();
           
           long mul=1;
           for(long i=a+1;i<=b;i++){
               long tem=i%10;
               mul=mul*tem;
               
               if(mul==0)break;
                
           }
           System.out.println(mul%10);
           
           
          
         }
         
         
}
