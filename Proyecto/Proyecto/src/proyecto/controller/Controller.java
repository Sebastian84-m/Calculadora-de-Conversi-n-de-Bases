package proyecto.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import proyecto.model.NumeroBase;
import proyecto.service.Conversion;
import proyecto.service.Validacion;

public class Controller {

    @FXML
    private TextField txtNumero;

    @FXML
    private ComboBox<Integer> cbOrigen;

    @FXML
    private ComboBox<Integer> cbDestino;

    @FXML
    private Label lblResultado;

    // Se ejecuta automáticamente al iniciar
    @FXML
    public void initialize() {

        // Agregar bases disponibles
        cbOrigen.getItems().addAll(2, 8, 10, 16);
        cbDestino.getItems().addAll(2, 8, 10, 16);

        // Valores por defecto
        cbOrigen.setValue(10);
        cbDestino.setValue(2);
    }

    @FXML
    public void convertir() {

        try {

            // Obtener datos de la interfaz
            String valor = txtNumero.getText().trim();

            int baseOrigen = cbOrigen.getValue();
            int baseDestino = cbDestino.getValue();

            // Crear objeto
            NumeroBase numero = new NumeroBase(valor, baseOrigen);

            // Validar
            if (!Validacion.esValido(numero)) {

                lblResultado.setText("Número inválido");
                return;
            }

            // Convertir a decimal
            int decimal = Conversion.aDecimal(numero);

            // Convertir a base destino
            String resultado = Conversion.deDecimal(decimal, baseDestino);

            // Mostrar resultado
            lblResultado.setText(resultado);

        } catch (Exception e) {

            lblResultado.setText("Error");
        }
    }
}
