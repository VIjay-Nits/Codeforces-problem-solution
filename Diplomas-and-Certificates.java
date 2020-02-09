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
         String[]s=br.readLine().trim().split("\\s+");
            long n=Long.parseLong(s[0]);
            long k=Long.parseLong(s[1]);
            
            long x=n/(2*(k+1));
            
            long rest=n-x-k*x;
            System.out.println(x+" "+k*x+" "+rest);
            
            
        
         
         }
         

}
