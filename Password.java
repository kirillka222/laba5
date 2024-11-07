import java.util.regex.*;
class myException extends Exception{
    myException(String text) {
        super(text);
    }
}
public class Password {
    public static void main(String[] args) {
        try{
            String password = "Afsdawre1";
            Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,16}$");
            Matcher matcher = pattern.matcher(password);

        if (!matcher.matches()) {
            throw new myException("Неверный пароль");
        } else {
            System.out.println("крутой пароль " + matcher.group());
        }
        } catch (myException e) {
            System.out.println(e.getMessage());
        }
    }
}
