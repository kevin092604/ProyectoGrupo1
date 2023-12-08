package Clases;

/**
 *
 * @author kevin
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private String numCuenta;
    
    public Alumno (String nombre, String apellido, String numCuenta){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numCuenta=numCuenta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido; 
    }
    
    @Override
    public String toString(){
        return "Datos del alumno: \n" + "Nombre: " + nombre + "\nApellido: " + "\nNumero de cuenta: " + numCuenta;
    }
}
