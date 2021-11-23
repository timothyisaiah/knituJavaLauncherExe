/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kintu.learning.center;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author ISAIAH
 */
public class KINTULearningCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Desktop desktop = Desktop.getDesktop();

        try {
            desktop.browse(new URI("http://www.toweroflove.org/kintu"));
        } catch (IOException | URISyntaxException e) {
            System.err.println("Error loading page :::::  " + e.getMessage());
        }
    }

}
