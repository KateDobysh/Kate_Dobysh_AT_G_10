package homework.day7.stringTask;

public class FindNumbers {
    public static void numbersSearch() {
        String textWithNumbers = "I can run 20 mins and rest 60 min";
        String[] words = textWithNumbers.split(" ");

        for (String word : words) {
            if (isNumeric(word)) {
                System.out.print(word + " ");
            }
        }
    }

    public static boolean isNumeric(String numbersInTheText) {
        return numbersInTheText.matches("\\d+");
    }
}