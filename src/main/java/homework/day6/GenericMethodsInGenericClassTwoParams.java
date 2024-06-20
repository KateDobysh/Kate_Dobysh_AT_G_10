package homework.day6;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public void genericMethodGenArgs(X value1, Y value2) {
        int args = 2;
        System.out.printf("I received %d arguments of type: %s class, %s class", args, value1.getClass().getSimpleName(), value2.getClass().getSimpleName());
    }

    public void genericMethodGenArgs(X value3) {
        int args = 1;
        System.out.printf("I received %d arguments of type: %s class", args, value3.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(X value4, String text) {
        int n = text.length();
        System.out.printf("I got an object of %s class and %s class and string with %d characters", value4.getClass().getSimpleName(), text.getClass().getSimpleName(), n);
    }

    public void genericMethodHalfGenArgs(String text1, Y value5) {
        int n = text1.length();
        System.out.printf("I got an object of %s class and %s class and string with %d characters", text1.getClass().getSimpleName(), value5.getClass().getSimpleName(), n);
    }

}