package homework.day7;

public class GenericMethodsInGenericClassTRunner {

    public static void main (String[] args){
        GenericMethodsInGenericClassT runGenericsMethod1 = new GenericMethodsInGenericClassT();
        runGenericsMethod1.genericMethodOneGenArg(" ");
        System.out.println();

        GenericMethodsInGenericClassT runGenericsMethod2 = new GenericMethodsInGenericClassT();
        runGenericsMethod2.genericMethodTwoGenArgs(0," ");
        System.out.println();

        GenericMethodsInGenericClassT runGenericsMethod3 = new GenericMethodsInGenericClassT();
        runGenericsMethod3.genericMethodHalfGenArgs(0, "some string");
    }
}