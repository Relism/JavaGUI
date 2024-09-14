package dev.relism;

import javax.swing.*;
import java.awt.*;

public class SimpleGuiApp {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Simple VNC Accessible GUI");

        // Add a label to the frame
        JLabel label = new JLabel("Hello, Gitpod + VNC!", SwingConstants.CENTER);

        // Set frame dimensions
        frame.setPreferredSize(new Dimension(1920, 1080));
        frame.getContentPane().add(label);

        // Close the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Arrange components, set the frame to be visible
        frame.pack();
        frame.setVisible(true);
    }
}