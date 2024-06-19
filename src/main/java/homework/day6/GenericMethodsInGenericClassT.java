package homework.day6;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T value) {
        System.out.printf(" I am an object of %s class ", value.getClass().getSimpleName());
        System.out.println();
    }

    public void genericMethodTwoGenArgs(T value1, T value2) {
        System.out.printf(" We are objects of %s class and %s class ", value1.getClass().getSimpleName(), value2.getClass().getSimpleName());
        System.out.println();
    }

    public void genericMethodHalfGenArgs(T value3, String text) {
        int amount = text.length();
        System.out.printf(" I got an object of %s class and string with %d characters ", value3.getClass().getSimpleName(), amount);
        System.out.println();
    }
}
