package project.console;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import project.command.Command;
import project.external_module.Module;
import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Console {
    Console() {}

    public static String input() {
        Scanner input = new Scanner(System.in);
        System.out.print(colorize("default@"+ Module.getHostName(), GREEN_TEXT())+"~$ ");

        if (input.hasNextLine()) {
            return input.nextLine();
        } else {
            return null;
        }
    }


    public static void lunchCommand(String command_line) {
        String[] command_name = command_line.split(" ");
        try {
            Class<Command> c = Command.class;
            Method command = c.getMethod(command_name[0], String.class);
            System.out.println(command);
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            ShowError.commandNotFound(command_name[0]);
        }
    }
}

