package View;

import java.util.Objects;
import java.util.Scanner;

public class View {

    public void enterText() {
        String input = "";
        while(!Objects.equals(input, "EXIT")){
            input = Prompt.promt();
        }
    }



}
