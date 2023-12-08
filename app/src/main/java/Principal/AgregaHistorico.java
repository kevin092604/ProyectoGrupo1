/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Global.Estado;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author Victor
 */
public class AgregaHistorico {

    @FXML
    private TextField teCodigoClase;
    @FXML
    private TextField teNombreClase;
    @FXML
    private Button bAceptar;

    public void aceptar(Event event) {
        String codigo = teCodigoClase.getText();
        String nombre = teNombreClase.getText();

        if (!codigo.isBlank() && !nombre.isBlank()) {
            if (Estado.getHistorialAcademico().buscarAsignatura(codigo)) {
                Alert alert = new Alert(AlertType.ERROR, "Esta asignatura ya forma parte de el historial academico", ButtonType.OK);
                alert.showAndWait();
            } else {
                Estado.getHistorialAcademico().agregarAsignatura(codigo, nombre);
                Estado.execCallback();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            }
        }
    }
}
