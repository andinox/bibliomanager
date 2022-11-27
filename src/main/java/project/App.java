package project;
import project.console.Console;

public class App {
    public static void main(String[] args) {
        String result;
        do {
            result = Console.input();
            if (result != null) Console.lunchCommand(result);
        } while(result != null);
         
    }
}
