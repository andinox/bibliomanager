package project.console;


import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;


public class ShowError {
    ShowError() {}

    public static void commandNotFound(String name) {
        System.out.println(colorize("La commande « " + name +" » n'a pas été trouvée." , BRIGHT_RED_TEXT()));
    }

    public static void commandHelpNotFound(String name) {
        System.out.println(colorize("Help: Aucune rubrique d'aide ne correspond à « " + name + " » ." , BRIGHT_RED_TEXT()));
    }
}
