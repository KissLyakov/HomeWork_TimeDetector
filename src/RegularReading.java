import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularReading {

    public static void ReadLine(String line)
    {
        String input = line;
        Pattern pattern = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}