package project.command;

import java.lang.reflect.Method;

import project.module.Module;

public class Help extends Command {

    public Help(String Command_line) {
        String[] command_args = Command_line.split(" ");
        
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
    
    private void _alone_() {
        String content = Module.loadText("/help.txt");
        System.out.println(content);
    }

}
