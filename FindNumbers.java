import java.util.regex.*;
public class FindNumbers {
    public static void main(String[] args) {
        String text = "The pri-15ce of the p-10.24roduct is $19.99";
        Pattern pattern = Pattern.compile("-?\\d+\\.\\d+|-?\\d+"); // ? - может быть ("-?\\d+\\(.\\d)+?|-?\\d+")
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


