import java.util.*;
 public class Vowels 
 {
     public static void main(String args[]) 
     { Scanner sc=new Scanner(System.in); 
       System.out.println("Enter your name:");
       String s; s=sc.nextLine();
       int i,l=s.length();
       char ch;
       System.out.println("Vowels in your name=");
       for(i=0;i<l;i++)
       {
           ch=s.charAt(i);
           if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
           System.out.print(ch);
        
        }
    }