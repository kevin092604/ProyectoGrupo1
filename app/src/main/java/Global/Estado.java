/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Global;

import Clases.*;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author Victor
 */
public class Estado {
    static Alumno alumnoActual;
    static Forma003 forma;
    static HistorialAcademico historial;
    static LinkedList<Seccion> secciones;
    static Consumer funcCallback;
    
    public static void inicializar() {
        alumnoActual = new Alumno("Kevin", "Garcia","20221002036");
        forma = new Forma003();
        historial = new HistorialAcademico(alumnoActual);
        secciones = new LinkedList<>();
    
        Seccion s1=new Seccion("Calculo 2", "MM-202", 900, "MM-201");
        Seccion s2=new Seccion("Algoritmos y estructura de datos", "IS-310", 2000, "IS-210");
        Seccion s3=new Seccion("Ecuaciones Diferenciales", "MM-401", 1000, "MM-202");
                
        secciones.add(s1);
        secciones.add(s2);
        secciones.add(s3);
        
        forma.agregarClaseMatriculada(new Seccion("Test", "T101", 9, "T100"));
    }
    
    public static void setAlumno(Alumno alumno) {
        alumnoActual = alumno;
    }
    
    public static Alumno getAlumno() {
        return alumnoActual;
    }
            
    public static List<Seccion> getSecciones(){
        LinkedList<Seccion> secciontesTemp = secciones;
        
        secciontesTemp.removeIf(data -> forma.getLista().indexOf(data) != -1);
        
        return secciontesTemp;
    }
    
    public static Forma003 getForma003() {
        return forma;
    }
    
    public static void setCallback(Consumer func)
    {
        funcCallback = func;
    }
    
    public static void execCallback() {
        funcCallback.accept(null);
    };
    
    public static HistorialAcademico getHistorialAcademico() {
        return historial;
    }
}
