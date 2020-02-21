
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;



public class Solution{
       
	public static void main(String[] args) {
		Scanner sdf = new Scanner(System.in);
		
                int t=1;
                while(t-->0){
                 
                    int num=sdf.nextInt();
                    int len=sdf.nextInt();
                    TreeSet<String>hs=new TreeSet<>();
                    Stack<String>st=new Stack<>();
                    Queue<String>qu=new LinkedList<>();
                    String mid="";
                    String fial="";
                    //System.out.println("1");
                    for(int i=0;i<num;i++){String temp=sdf.next();hs.add(temp);}
                    while(!hs.isEmpty()){
                       // System.out.println("2");
                        String s=hs.first();
                        hs.remove(hs.first());
                        StringBuffer sb=new StringBuffer(s);
                        sb.reverse();
                        String rs=sb.toString();
                        if(hs.contains(rs)){
                            hs.remove(rs);
                            qu.offer(s);
                            st.push(rs);
                        }
                        else if(s.equals(rs))mid=s;
                    }
                    //System.out.println("10");
                    while(!qu.isEmpty()){
                        fial=fial+qu.poll();
                    }
                    //System.out.println("11");
                    fial=fial+mid;
                    while(!st.isEmpty())fial=fial+st.pop();
                    System.out.println(fial.length());
                    System.out.println(fial);
                    
                }
               
        }
   


}
