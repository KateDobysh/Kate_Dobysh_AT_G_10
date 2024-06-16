package homework.day7;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T value) {
        System.out.printf("I am an object of %s class", getClass().getSimpleName());
    }

    public void genericMethodTwoGenArgs(T value1, T value2) {
        System.out.printf("We are objects of %s class and %s class", getClass().getSimpleName(), getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(T value3, String text) {
        int amount = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLetter(letter)) {
                amount++;
            }
        }
        System.out.printf("I got an object of %s class and string with %d characters", getClass().getSimpleName(), amount);
    }
}