package fr.andinox.bibliomanager;
import fr.andinox.bibliomanager.console.Console;

public class main {
    
    public static void main(String[] args) {
        String result;
        do {
            result = Console.input();
            if (result != null) Console.lunchCommand(result);
        } while(result != null);
         
    }
}
