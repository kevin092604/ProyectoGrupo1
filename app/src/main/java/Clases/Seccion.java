package Clases;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;

/**
 *
 * @author kevin
 */
public class Seccion {

    private String nombreClase;
    private String codigoClase;
    private int horaInicio, cupos = 30;
    private String requisito1 = null;
    private SimpleBooleanProperty checked = new SimpleBooleanProperty(false);

    public Seccion(String nombreClase, String codigoClase, int horaInicio,
            String requisito1) {
        this.horaInicio = horaInicio;
        this.codigoClase = codigoClase;
        this.nombreClase = nombreClase;
        this.requisito1 = requisito1;
    }

    /**
     * @return the nombreClase
     */
    public String getNombreClase() {
        return nombreClase;
    }

    /**
     * @param nombreClase the nombreClase to set
     */
    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    /**
     * @return the codigoClase
     */
    public String getCodigoClase() {
        return codigoClase;
    }

    /**
     * @param codigoClase the codigoClase to set
     */
    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }

    /**
     * @return the horaInicio
     */
    public int getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the cupos
     */
    public int getCupos() {
        return cupos;
    }

    /**
     * @param cupos the cupos to set
     */
    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    /**
     * @return the requisito1
     */
    public String getRequisito1() {
        return requisito1;
    }

    /**
     * @param requisito1 the requisito1 to set
     */
    public void setRequisito1(String requisito1) {
        this.requisito1 = requisito1;
    }

     public SimpleBooleanProperty checkedProperty() {
        return this.checked;
    }

    public java.lang.Boolean getChecked() {
        return this.checkedProperty().get();
    }

    public void setChecked(final java.lang.Boolean checked) {
        this.checkedProperty().set(checked);
    }

    @Override
    public String toString() {
        return "Nombre de la clase: " + nombreClase + " \nCodigo de la clase: "
                + codigoClase + " \nHora inicio: " + horaInicio + "\nCupos: "
                + cupos + " \nRequisito: " + requisito1;
    }
}
