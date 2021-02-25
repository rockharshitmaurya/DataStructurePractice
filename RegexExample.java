import java.util.regex.*;
class RegexExample
{
	public static void main(String args[])
	{
		// Pattern pattern=Pattern.compile(".xx.");
		// Matcher matcher=pattern.matcher("axxa");
		// System.out.println("Pattern Match Found "+matcher.matches());
		// System.out.println(Pattern.matches("[abc]","a"));
		// System.out.println(Pattern.matches("[^abc]","d"));
		// System.out.println(Pattern.matches("[a-zA-Z]","h"));
		// System.out.println(Pattern.matches("[a-d][m-p]","cn"));
		// System.out.println(Pattern.matches("[a-z&&[def]]","f"));
		// System.out.println(Pattern.matches("[a-z&&[^bc]]","d"));
		// System.out.println(Pattern.matches("[a-z&&[^m-p]]","k"));
		System.out.println(Pattern.matches("\\bhackerrank.*\\b","hackerrank i love hackerrank"));
	}
}