package PROYECTO.ARQUITECTURA;

import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConversionGUI gui = new ConversionGUI();
            gui.setLocationRelativeTo(null);
            gui.setVisible(true);
        });
    }
}