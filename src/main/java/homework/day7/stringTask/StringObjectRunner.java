package homework.day7.stringTask;

public class StringObjectRunner {
    public static void main(String[] args) {
        ColumnLetters lettersTask = new ColumnLetters();
        CurrentDateTime currentDandTtask = new CurrentDateTime();
        Duplicates duplicateTask = new Duplicates();
        FindNumbers findNumbersTask = new FindNumbers();
        TextLog logTextTask = new TextLog();

        lettersTask.columnsTask();
        System.out.println();
        currentDandTtask.currentDT();
        System.out.println();
        duplicateTask.duplicat();
        System.out.println();
        findNumbersTask.numbersSearch();
        System.out.println();
        logTextTask.textLogTask();
        System.out.println();
    }
}