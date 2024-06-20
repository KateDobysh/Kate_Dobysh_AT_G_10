package homework.day7.stringTask;

public class ColumnLetters {
        public static void columnsTask() {
            String text = "I can sit and look at it for hours.";

            char[] lettersInColumn = text.toCharArray();
            for (char letter : lettersInColumn) {
                System.out.println(letter);
            }
        }
    }