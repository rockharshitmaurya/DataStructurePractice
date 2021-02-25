import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {
public static void main(String args[])
{
    // String regex="^(.+)@(.+)$";
    // String regex="^[a-zA-Z0-9+._-]+@(.+)$";
    String regex="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    Pattern pattern=Pattern.compile(regex);
    Matcher matcher=pattern.matcher("rockharshitmaurya@gmail.com");
    System.out.println(matcher.matches());

}    
}