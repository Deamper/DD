//Дана строка. Подсчитать количество содержащихся в ней цифр.
import java.io.*;
public class Experementation {
    public static void main(String[] args) {
        String textString = new String("Добро-пожаловать-на-prog.kiev.ua");
        System.out.println("Возвращаемое значение: ");
        for (String retval : textString.split("-", 2)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение ");
        for (String retval : textString.split("-", 3)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение ");
        for (String retval : textString.split("-", 0)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение ");
        for (String retval : textString.split("-")) {
            System.out.println(retval);
        }
    }
}