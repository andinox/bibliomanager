package project.console;

import project.command.Command;
import project.external_module.Module;
import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;


public class ShowError extends Console {
    ShowError() {}

    public static void commandNotFound(String name) {
        System.out.println(colorize("Command not found : " + name , RED_TEXT()));
    }
}
