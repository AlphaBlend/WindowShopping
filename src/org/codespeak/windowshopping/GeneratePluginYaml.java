package org.codespeak.windowshopping;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A class that generates the file plugin.yml
 *
 * @author Vector
 */
public class GeneratePluginYaml {

    public static void main(String[] args) {
        File pluginFile = new File("src\\plugin.yml");
        PrintWriter pr = null;

        try {
            pr = new PrintWriter(pluginFile);
            pr.println("name: " + Configuration.PLUGIN_NAME);
            pr.println("version: " + Configuration.PLUGIN_VERSION);
            pr.println("author: " + Configuration.PLUGIN_AUTHOR);
            pr.println("main: org.codespeak.windowshopping.WindowShopping");
            pr.println("api-version: 1.13");
            pr.flush();

            System.out.println("Generated plugin.yml!");
        } catch (IOException ioe) {
            System.out.println("Unable to create YAML file!" + ioe.getMessage());
        } finally {
            if (pr != null) {
                pr.close();
            }
        }
    }

}
