// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();
//         String[] s = new String[n];
//         for(int i=0;i<n;i++){
//             s[i] = sc.nextLine();            
//         }
//         SortedSet<String> tags = new TreeSet<String>();
//         for(int i=0; i<n; i++)
//         {
//             Pattern p=Pattern.compile("<\\b(\\w+)\\b.*?>");
//             Matcher m=p.matcher(s[i]);
//             while(m.find())
//             {
//                 tags.add(m.group(1));
//             }
//         }
//         String temp="";
//         for(String l:tags)
//         {
//         temp+=l+";";
//         }

//         System.out.println(temp.substring(0, (temp.length()-1)));
//     }
// }
// import java.io.*;
import java.util.*;
//import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc=new Scanner(System.in);
     int N=Integer.parseInt(sc.nextLine());
     String[] str=new String[N];
     for(int i=0; i<N; i++)
     {
         str[i]=sc.nextLine().toLowerCase();
     }
     for(int i=0; i<N; i++)
     {
       // Pattern p=Pattern.compile("\\bhackerrank\\b");
        //Matcher m=p.matcher(str[i]);
        // while(m.find())
        // {
        //     if(m.group(1).equals("hackerrank") && m.group(2).equals("hackerrank"))
        //     {
        //         System.out.println("0");
        //     }
        //     else if(m.group(1).equals("hackerrank"))
        //     {
        //          System.out.println("1");
        //     }
        //     else if(m.group(2).equals("hackerrank"))
        //     {
        //              System.out.println("2");
        //     }
        //     else
        //     {
        //          System.out.println("-1");
        //     }
       // }
       sc.close();
     }

    }
}