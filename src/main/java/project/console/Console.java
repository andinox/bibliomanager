package project.console;

import java.util.Scanner;

import project.command.Command;
import project.module.Module;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Console {
    public static Scanner input;

    Console() {}

    public static String input() {
        input = new Scanner(System.in);
        System.out.print(colorize("default@"+ Module.getHostName(), GREEN_TEXT())+":"+colorize("~",BLUE_TEXT())+"$ ");
        return ( input.hasNextLine() ) ?  input.nextLine() : null;
    }

    public static void lunchCommand(String command_line) {
        if (command_line.substring(command_line.length()-1) == " ") 
            command_line = command_line.substring(0, command_line.length()-1);
        Command cmd = new Command(command_line);
        if (!cmd.isValid()) ShowError.commandNotFound(command_line.split(" ")[0]);
    }


}

