package Clases;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author kevin
 */
public class HistorialAcademico {
    private Alumno alumno;
    HashMap<String, String> historial=new HashMap<>();
    
    public HistorialAcademico(Alumno alumno){
        this.alumno=alumno;
    }
    /*
    Metodo para agregar asignatura al historial, datos:
    String Codigo de clase
    String Nombre de clase
    */ 
    public void agregarAsignatura(String codigo, String clase){
        historial.put(codigo, clase);
    }
    /*
    Metodo para eliminar asignatura del historial por medio del 
    codigo de la clase
    String codigo de clase
    */
    public void eliminarAsignatura(String codigo){
        historial.remove(codigo);
    }
    /*
    Metodo para buscar asignatura 
    String codigo de clase
    Devuelve true si la asignatura fue encontrada mediante el codigo de clase, si no se
    encuentra ninguna devuelve false
    */
    public boolean buscarAsignatura(String codigo){
        if(historial.containsKey(codigo)){
            return true;
        }else{
            return false;
        }
    }
    /*
    Metodo para imprimir las asignaturas del historial
    */
    public void imprimirAsignatura(){
        if(!historial.isEmpty()){
            System.out.println(historial);
        }else{
            System.out.println("El historial está vacío");
        }
    }
    
    public LinkedList<Seccion> getLista(){
        LinkedList<Seccion> secciones = new LinkedList<>();
        
        historial.forEach((t, u) -> {
            secciones.add(new Seccion(u, t, 0, ""));
        });
        
        return secciones;
    }

    /**
     * @return the alumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
