package homework_day11;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdsList {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }
        Set<Character> allVowels = new HashSet<>(Arrays.asList('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я'));
        int countVowels = 0;
        int countBirds = 0;
        for (String bird : birds) {
            for (char letter : bird.toCharArray()) {
                if (allVowels.contains(letter)) {
                    countVowels++;
                }
            }
            if (countVowels > 1) {
                countBirds++;
            }
        }
        System.out.println("Amount of birds that contain more than 1 vowel: " + countBirds);
        for (int i=0; i<birds.size();i++){
            String listOfBirds = birds.get(i);
            System.out.print(listOfBirds + " ");
        }
        System.out.println();
        birds.set(3, "Синица");
        for (String bird : birds){
            System.out.print(bird + " ");
        }
    }
}