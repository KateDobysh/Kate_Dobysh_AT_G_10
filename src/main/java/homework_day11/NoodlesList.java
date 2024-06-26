package homework_day11;

import java.util.ArrayList;
import java.util.List;

public class NoodlesList {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("стринги Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");
        for (String noodle: noodles){
            System.out.print(noodle + "-");
        }
        System.out.println();
        List<String> replacedNoodles = new ArrayList<>();
        for (int i = 0; i<noodles.size(); i++){
            String replaceChar = noodles.get(i).replace("a", "o");
            replacedNoodles.add(replaceChar);
        }
        System.out.print(replacedNoodles + " ");
    }
}
