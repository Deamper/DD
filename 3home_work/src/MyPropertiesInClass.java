import java.util.Properties;

public class MyPropertiesInClass {
    public static void main(String[] args) {
        printMySystemProperties();
    }
    public static void printMySystemProperties() {
    // Тело метода
        Properties props = System.getProperties();
        props.list(System.out);
    }

}
