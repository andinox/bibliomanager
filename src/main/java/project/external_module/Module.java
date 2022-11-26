package project.external_module;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Module {
    Module() {}

    public static String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "localhost";
        }
    }
}
