package homework.day7.stringTask;

public class Duplicates {

    public static void duplicat() {
        String text = "I can sit and I can look";
        String[] textSplitted = text.split(" ");
        String duplicates = "";
        for (int i = 0; i < textSplitted.length; i++) {
            for (int j = i + 1; j < textSplitted.length; j++) {
                if (textSplitted[i].equals(textSplitted[j])) {
                    duplicates += textSplitted[i] + " ";
                }
            }
        }
        System.out.println(duplicates);
    }
}