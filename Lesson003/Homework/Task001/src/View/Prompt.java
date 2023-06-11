package View;

import java.util.Scanner;

public class Prompt {
    public static String promt(){
        return promt(PromptText.defaultMsg);
    }
    public static String promt(String entryText){
        Scanner scanner = new Scanner(System.in);

        System.out.print(entryText);
        String input = scanner.nextLine();

        return input;
    }
}
