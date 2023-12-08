/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Global.Estado;
import Clases.*;
import java.util.List;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;

public class AgregarClaseController {

    /**
     * Forma 003 *
     */
    @FXML
    private TableView<Seccion> tSecciones;
    @FXML
    private TableColumn<Seccion, String> tcNombre;
    @FXML
    private TableColumn<Seccion, String> tcCodigo;
    @FXML
    private TableColumn<Seccion, String> tcRequisito;
    @FXML
    private TableColumn<Seccion, Boolean> tcSelect;
    /**
     * Forma 003 *
     */

    private List<Seccion> lista;

    public void initialize() {
        /**
         * FORMA 003 *
         */
        lista = Estado.getSecciones();
        tSecciones.getItems().setAll(lista);
        tcNombre.setCellValueFactory(new PropertyValueFactory<>("nombreClase"));
        tcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigoClase"));
        tcRequisito.setCellValueFactory(new PropertyValueFactory<>("requisito1"));
        tcSelect.setEditable(true);
        tcSelect.setCellValueFactory((CellDataFeatures<Seccion, Boolean> cellData) -> cellData.getValue().checkedProperty());
        tcSelect.setCellFactory((TableColumn<Seccion, Boolean> param) -> new CheckBoxTableCell<Seccion, Boolean>() {
            @Override
            public void updateItem(Boolean item, boolean empty) {
                super.updateItem(item, empty);

                Seccion currentRow = getTableRow().getItem();
                if (currentRow != null && !Estado.getHistorialAcademico().buscarAsignatura(currentRow.getRequisito1())){
                    this.setDisable(true);
                }
            }
        });
    }

    public void aceptar(Event event) {
        lista.forEach(data -> {
            Boolean valor = data.getChecked();
            if (valor) {
                Estado.getForma003().agregarClaseMatriculada(data);
                data.checkedProperty().set(false);
            }
        });
        Estado.execCallback();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}
