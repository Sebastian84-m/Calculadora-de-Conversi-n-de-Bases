package PROYECTO.ARQUITECTURA;

import javax.swing.*;
import java.awt.*;

public class ConversionGUI extends JFrame {

    private JTextField txtInput;
    private JComboBox<Integer> baseInput;
    private JComboBox<Integer> baseOutput;
    private JTextField txtResult;

    public ConversionGUI() {
        setTitle("Conversor de Bases (2, 8, 10, 16)");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        txtInput = new JTextField();
        txtResult = new JTextField();
        txtResult.setEditable(false);

        Integer[] bases = {2, 8, 10, 16};

        baseInput = new JComboBox<>(bases);
        baseOutput = new JComboBox<>(bases);

        JButton btnConvert = new JButton("Convertir");

        add(new JLabel("Numero:"));
        add(txtInput);

        add(new JLabel("Base de entrada:"));
        add(baseInput);

        add(new JLabel("Base de salida:"));
        add(baseOutput);

        add(btnConvert);
        add(new JLabel(""));

        add(new JLabel("Resultado:"));
        add(txtResult);

        // Evento
        btnConvert.addActionListener(e -> convertir());
    }

    private void convertir() {
        try {
            String value = txtInput.getText();
            int baseIn = (int) baseInput.getSelectedItem();
            int baseOut = (int) baseOutput.getSelectedItem();

            if (!Validacion.Valido(value, baseIn)) {
                JOptionPane.showMessageDialog(this, "Numero invalido para la base seleccionada");
                return;
            }

            NumeroBase num = new NumeroBase(value, baseIn);

            int decimal = Conversion.aDecimal(num);
            String result = Conversion.deDecimal(decimal, baseOut);

            txtResult.setText(result);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}