package Clases;

import java.util.LinkedList;

/**
 *
 * @author kevin
 */
public class Forma003 {

    LinkedList<Seccion> clasesMatriculadas = new LinkedList<>();
    LinkedList<Seccion> clasesCanceladas = new LinkedList<>();

    public boolean agregarClaseMatriculada(Seccion clase) {
        return this.clasesMatriculadas.add(clase);
    }

    public void eliminarClaseMatriculada(String nombreClase) {
        boolean claseEncontrada = false;
        for (int i = 0; i < clasesMatriculadas.size(); i++) {
            if (clasesMatriculadas.get(i).getNombreClase().equals(nombreClase)) {
                clasesMatriculadas.remove(i);
                claseEncontrada = true;
            }
            if (!claseEncontrada) {
                System.out.println("La clase no fue encontrada");
            }
        }
    }

    public boolean buscarClase(String nombreClase) {
        boolean claseEncontrada = false;
        for (int i = 0; i < clasesMatriculadas.size(); i++) {
            if (clasesMatriculadas.get(i).getNombreClase().equals(nombreClase)) {
                return claseEncontrada = true;
            } else {
                return claseEncontrada = false;
            }
        }
        return claseEncontrada;
    }
    
    public boolean buscarClase(Seccion seccion) {
        boolean claseEncontrada = false;
        for (int i = 0; i < clasesMatriculadas.size(); i++) {
            if (clasesMatriculadas.get(i).equals(seccion)) {
                return claseEncontrada = true;
            } else {
                return claseEncontrada = false;
            }
        }
        return claseEncontrada;
    }

    public boolean eliminarPorIndice(int Indice) {
        Seccion clase = clasesMatriculadas.get(Indice);
        clasesCanceladas.add(clase);
        
        System.out.println(clasesCanceladas.size());
        clasesMatriculadas.remove(Indice);
        
        return true;
    }

    public int cantidadClases() {
        return clasesMatriculadas.size();
    }
    
    public LinkedList<Seccion> getLista(){
        return this.clasesMatriculadas;
    }
    
    public LinkedList<Seccion> getListaCanceladas(){
        return this.clasesCanceladas;
    }

    public void mostrarAsignaturas() {
        for (int i = 0; i < clasesMatriculadas.size(); i++) {
            System.out.println(i + 1 + "- " + clasesMatriculadas.get(i));
        }
    }

    @Override
    public String toString() {
        return "Clases matriculadas:\n" + clasesMatriculadas.toString();
    }

}
