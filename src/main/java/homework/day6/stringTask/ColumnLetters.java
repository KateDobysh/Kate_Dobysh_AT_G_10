package homework.day6.stringTask;

public class ColumnLetters {
    public static void main(String[] args) {
        String text = "I can sit and look at it for hours.";

        char[] lettersInColumn = text.toCharArray();
        for (char letter : lettersInColumn) {
            System.out.println(letter);
        }
    }
}