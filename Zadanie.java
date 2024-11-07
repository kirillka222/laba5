import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie {
    public static void main(String[] args) {
        try {
            String flag = "r";
            String str = "Tfesrsfa rfvavx Rsfacac grghrdv efeffasas /rasas";
            Pattern pattern = Pattern.compile("\\s[" + flag.toLowerCase() + flag.toUpperCase() + "][a-zA-Z]*");
            Matcher matcher = pattern.matcher(str);
            if (!matcher.find()){
                throw new TextLengthException11("Нет результатов");
            } matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        catch (TextLengthException11 e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Некорректный ввод");
        }
    }
}

