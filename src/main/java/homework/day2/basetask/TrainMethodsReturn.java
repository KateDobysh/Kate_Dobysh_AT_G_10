package homework.day2.basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int number) {
        return number * 3;
    }

    public long returnNewLong(long number) {
        return number - 4;

    }

    public String returnNewChar(char symbol) {
        return new String(symbol + " " + symbol);
    }

    public float returnNewFloat(float number) {
        return number / 2;
    }

    public double returnNewDouble(double number) {
        return number + 8;
    }

    public short returnNewShort(int number) {
        return (short) (number - 1);
    }

    public byte returnNewByte(int number) {
        return (byte) (number * 2);
    }

    public boolean returnNewBoolean(boolean value){
        return !value;
    }

}
