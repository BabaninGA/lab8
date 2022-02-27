//Исключение для ситуации, когда знаменатель дроби равен нулю
public class ExceptionForNull extends Exception {
    public ExceptionForNull() {
        System.out.println("Знаменатель простой дроби не может быть нулём");
        System.exit(1);
    }
}