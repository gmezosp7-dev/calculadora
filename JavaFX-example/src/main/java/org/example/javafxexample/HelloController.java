package org.example.javafxexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label pantalla;

    private Calculadora calc = new Calculadora();

    @FXML
    protected void onDigito(ActionEvent e) {
        Button b = (Button) e.getSource();
        calc.escribirDigito(b.getText());
        pantalla.setText(calc.getPantalla());
    }

    @FXML
    protected void operacion(ActionEvent e) {
        Button b = (Button) e.getSource();
        calc.operacion(b.getText());
        pantalla.setText(calc.getPantalla());
    }

    @FXML
    protected void onIgual() {
        calc.resultadoOperacion();
        pantalla.setText(calc.getPantalla());
    }

    @FXML
    protected void onLimpiar() {
        calc.limpiar();
        pantalla.setText(calc.getPantalla());
    }

    @FXML
    protected void onBorrar() {
        calc.borrar();
        pantalla.setText(calc.getPantalla());
    }
}