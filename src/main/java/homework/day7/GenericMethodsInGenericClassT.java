package homework.day7;

import org.w3c.dom.ls.LSOutput;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg() {
        T value;
        System.out.printf("I am an object of %s class",getClass());


    }

}