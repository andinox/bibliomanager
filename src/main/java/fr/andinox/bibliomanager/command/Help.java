package fr.andinox.bibliomanager.command;

import java.lang.reflect.Method;

import fr.andinox.bibliomanager.module.Module;

public class Help  {
    private Boolean valid;
    private String command_line;
    public Help(String command_line) {
        this.command_line = command_line;
        String[] command_args = command_line.split(" ");
        
        if (command_args.length == 1) {
            _alone_();
            valid = true;
        } else {
           try {
                Method command = Command.class.getMethod(command_args[1]);
                command.invoke(this);
                valid = true;
            } catch (Exception e) {
                valid = false;
            } 
        }
        
    }

    public boolean isValid() {return valid;}

    public void _alone_() {
        String content = Module.loadText("/help.txt");
        System.out.println(content);
    }
    public void clear() {
        String content = Module.loadText("/clear.txt");
        System.out.println(content);
    }

}
