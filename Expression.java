 
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
         int a=Integer.parseInt(br.readLine());
         int b=Integer.parseInt(br.readLine());
         int c=Integer.parseInt(br.readLine());
         int aa[]=new int [4];
         aa[0]=a*b*c;
         aa[1]=a+b+c;
         aa[2]=(a+b)*c;
         aa[3]=a*(b+c);
         Arrays.sort(aa);
         System.out.println(aa[3]);
         
         }
         
         
         
         
         
         
         
         
 
}
