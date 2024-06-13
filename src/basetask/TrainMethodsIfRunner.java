package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf callAll = new TrainMethodsIf();

        int returnInt = callAll.returnNewInt(10);
        System.out.println("метод returnNewInt вернул " + returnInt);
        long returnLong = callAll.returnNewLong(100000l);
        System.out.println("метод returnNewLong вернул " + returnLong);
        String returnChar = callAll.returnNewChar('e');
        System.out.println("метод returnNewChar вернул " + returnChar);
        float returnFloat = callAll.returnNewFloat(0.67f);
        System.out.println("метод returnNewFloat вернул " + returnFloat);
        double returnDouble = callAll.returnNewDouble(1.51);
        System.out.println("метод returnNewDouble вернул " + returnDouble);
        callAll.returnNewBoolean(false);


    }
}
