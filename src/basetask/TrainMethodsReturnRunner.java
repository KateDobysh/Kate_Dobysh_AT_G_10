package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn callAll = new TrainMethodsReturn();

        int intValue = callAll.returnNewInt(3);
        System.out.println("метод returnNewInt вернул"  + intValue);
        long longValue = callAll.returnNewLong(100000000l);
        System.out.println("метод returnNewLong вернул " + longValue);
        String charValue = callAll.returnNewChar('@');
        System.out.println("метод returnNewChar вернул " + charValue);
        float floatValue = callAll.returnNewFloat(1.65465465f);
        System.out.println("метод returnNewFloat вернул " + floatValue);
        double doubleValue = callAll.returnNewDouble(1255.22);
        System.out.println("метод returnNewDouble вернул " + doubleValue);
        short shortValue = callAll.returnNewShort(5);
        System.out.println("метод returnNewShort вернул " + shortValue);
        byte byteValue = callAll.returnNewByte(15);
        System.out.println("метод returnNewByte вернул " + byteValue);
        boolean booleanValue = callAll.returnNewBoolean(false);
        System.out.println("метод returnNewBoolean вернул " + booleanValue);
    }
}
