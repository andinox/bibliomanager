package fr.andinox.bibliomanager.module;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Module {
    Module() {}

    public static String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "localhost";
        }
    }

    /**
     * Charge le contenue d'un fichier text
     * 
     * @param path le lien vers le fichier text
     * @return le contenue du fichier dans une string
     */
    public static String loadText(String path) {
        InputStream text_path = Module.class.getResourceAsStream(path);
        Scanner scan = new Scanner(text_path);
        String str = "";
        while(scan.hasNextLine()) {
            str = str + (scan.nextLine().replace("’","'")) + "\n";
        }
        scan.close();
        return str;
    }
}
