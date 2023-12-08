/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Global.Estado;
import Clases.*;
import java.util.TimerTask;
import java.util.function.Function;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Controller {

    @FXML
    private Label lNombreAlumno;
    @FXML
    private Label lNumeroCuenta;
    
    /**
     * Forma 003 *
     */
    @FXML
    private TableView<Seccion> tHistorico;
    @FXML
    private TableColumn<Seccion, String> tcNombreHistorico;
    @FXML
    private TableColumn<Seccion, String> tcCodigoHistorico;
    /**
     * Forma 003 *
     */


    /**
     * Forma 003 *
     */
    @FXML
    private TableView<Seccion> tForma;
    @FXML
    private TableColumn<Seccion, String> tcNombre;
    @FXML
    private TableColumn<Seccion, String> tcCodigo;
    @FXML
    private TableColumn<Seccion, String> tcAcciones;
    /**
     * Forma 003 *
     */

    /**
     * Canceladas *
     */
    @FXML
    private TableView<Seccion> tCanceladas;
    @FXML
    private TableColumn<Seccion, String> tcNombreCanceladas;
    @FXML
    private TableColumn<Seccion, String> tcCodigoCanceladas;
    /**
     * Canceladas *
     */

    /**
     * Forma 003 *
     */
    @FXML
    private Button bAgregarClase;
    @FXML
    private Button bAgregarHistorico;

    /**
     * Forma 003 *
     */
    public void initialize() {
        lNombreAlumno.setText(Estado.getAlumno().getNombreCompleto());
        lNumeroCuenta.setText(Estado.getAlumno().getNumCuenta());

        /**
         * FORMA 003 *
         */
        tForma.getItems().setAll(Estado.getForma003().getLista());

        Callback<TableColumn<Seccion, String>, TableCell<Seccion, String>> cellFactoryForma
                = //
                (final TableColumn<Seccion, String> param) -> {
                    final TableCell<Seccion, String> cell = new TableCell<Seccion, String>() {

                final Button btn = new Button("Cancelar asignatura");

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        btn.setOnAction(event -> {
                            Estado.getForma003().eliminarPorIndice(getIndex());
                            tCanceladas.getItems().setAll(Estado.getForma003().getListaCanceladas());
                            getTableView().getItems().remove(getIndex());
                        });
                        setGraphic(btn);
                        setText(null);
                    }
                }
            };
                    return cell;
                };

        tcNombre.setCellValueFactory(new PropertyValueFactory<>("nombreClase"));
        tcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigoClase"));
        tcAcciones.setCellFactory(cellFactoryForma);
        /**
         * FORMA 003 *
         */

        /**
         * Canceladas *
         */
        tCanceladas.getItems().setAll(Estado.getForma003().getListaCanceladas());
        tcNombreCanceladas.setCellValueFactory(new PropertyValueFactory<>("nombreClase"));
        tcCodigoCanceladas.setCellValueFactory(new PropertyValueFactory<>("codigoClase"));

        /**
         * Canceladas *
         */
        
        /**
         * Historico *
         */
        tHistorico.getItems().setAll(Estado.getHistorialAcademico().getLista());
        tcNombreHistorico.setCellValueFactory(new PropertyValueFactory<>("nombreClase"));
        tcCodigoHistorico.setCellValueFactory(new PropertyValueFactory<>("codigoClase"));

        /**
         * Historico *
         */
        
        Estado.setCallback(data -> {  
            tForma.getItems().setAll(Estado.getForma003().getLista());
            tHistorico.getItems().setAll(Estado.getHistorialAcademico().getLista());
        });
    }

    public void agregarClase() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/AgregarClase.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setFullScreen(false);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarHistorico() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/AgregarHistorico.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setFullScreen(false);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void planDeEstudio() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/PlanDeEstudio.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setFullScreen(false);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
