package recruitmenttask.task1;

import recruitmenttask.task1.service.InputText;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String string = InputText.textFromconsole("please enter text(any non-letter characters and polish characters will be ignored!!!)").trim();
        Set<String> lettersInText = new HashSet<>(Arrays.asList(string.replaceAll("\\s", "").split("")));
        Set<String> nonrepeatingWordsInText = new HashSet<>(Arrays.asList(string.split(" ")));


        for (String s: lettersInText
             ) {
            System.out.print(s + ": ");
            nonrepeatingWordsInText.stream().sorted().filter(elem -> elem.contains(s)).forEach(elem -> System.out.print(elem + ", "));
            System.out.println();
        }
    }
}
