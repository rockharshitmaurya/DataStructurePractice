import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String args[])
{
System.out.println("Enter Your Patter");
Scanner sc=new Scanner(System.in);
String RegexPattern=sc.nextLine();
Pattern pattern=Pattern.compile(RegexPattern);
Matcher matcher=pattern.matcher("My Name Is Harshit");
boolean flag=false;
while(matcher.find())
{
    System.out.println("Found the text "+matcher.group()+" at the starting index of "+matcher.start()+" and the ending index "+matcher.end());
    flag=true;
}
if(!flag)
{
    System.out.println("Matcher Not Found");
}
sc.close();
}    
}