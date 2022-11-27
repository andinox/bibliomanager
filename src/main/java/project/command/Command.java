package project.command;

import java.lang.reflect.Method;

import project.console.ShowError;

public class Command {
    protected Boolean valid;
    protected String line;

    public Command() {}

    public Command(String args) {
        line = args;
        String[] command_args = args.split(" ");
        try {
            Method command = Command.class.getMethod(command_args[0]);
            command.invoke(this);
            valid = true;
        } catch (Exception e) {
            e.printStackTrace();
            valid = false;
        }
    }

    public void test() {
        System.out.println("test");
    }

    public boolean isValid() {return valid;}

    public void cls() {clear();}

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void help() {
        Command help = new Help(line);
        if (!help.isValid()) ShowError.commandHelpNotFound(line.split(" ")[1]);
    }
}
