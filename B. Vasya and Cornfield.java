
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
                int d=s.nextInt();
                int gh=s.nextInt();
                int[][]a=new int[gh][4];
                int x=0,y=0;
                
                for(int i=0;i<gh;i++){
                    x=s.nextInt();
                    y=s.nextInt();
                    int e1=x+y;
                    int e2=x-y;
                    if(e1<=2*n-d&&e1>=d&&e2>=-d&&e2<=d)System.out.println("YES");
                    else System.out.println("NO");
                }
   	}     
}
