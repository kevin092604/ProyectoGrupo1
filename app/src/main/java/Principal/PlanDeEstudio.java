/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.LinkedList;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 *
 * @author Victor
 */
public class PlanDeEstudio {
    
    @FXML
    private TreeView aPlan;
    
    public LinkedList<TreeItem> ObtenerTodo() {
        LinkedList<TreeItem> lista = new LinkedList<>();
        TreeItem primerAnyo = new TreeItem("Primer año");
        TreeItem segundoAnyo = new TreeItem("Segundo año");
        TreeItem tercerAnyo = new TreeItem("Tercer año");
        TreeItem cuartoAnyo = new TreeItem("Cuarto año");
        TreeItem quintoAnyo = new TreeItem("Quinto año");
        
        TreeItem primerPeriodo = new TreeItem("Primer periodo");
        primerPeriodo.getChildren().add(new TreeItem("Matemáticas I"));
        primerPeriodo.getChildren().add(new TreeItem("Geometría y Trigonometría"));
        primerPeriodo.getChildren().add(new TreeItem("Introducción. a la Ingeniería en Sistemas"));
        primerPeriodo.getChildren().add(new TreeItem("Sociología"));
        
        TreeItem segundoPeriodo = new TreeItem("Segundo periodo");
        segundoPeriodo.getChildren().add(new TreeItem("Vectores y Matrices"));
        segundoPeriodo.getChildren().add(new TreeItem("Inglés I"));
        segundoPeriodo.getChildren().add(new TreeItem("Cálculo I"));
        segundoPeriodo.getChildren().add(new TreeItem("Campo de las Deportes"));
        
        TreeItem tercerPeriodo = new TreeItem("Tercer periodo");
        tercerPeriodo.getChildren().add(new TreeItem("Español General"));
        tercerPeriodo.getChildren().add(new TreeItem("Inglés II"));
        tercerPeriodo.getChildren().add(new TreeItem("Cálculo II"));
        tercerPeriodo.getChildren().add(new TreeItem("Programación I"));
        
        primerAnyo.getChildren().add(primerPeriodo);
        primerAnyo.getChildren().add(segundoPeriodo);
        primerAnyo.getChildren().add(tercerPeriodo);
        
        TreeItem cuartoPeriodo = new TreeItem("Cuarto periodo");
        cuartoPeriodo.getChildren().add(new TreeItem("Física I"));
        cuartoPeriodo.getChildren().add(new TreeItem("Ecuaciones Diferenciales"));
        cuartoPeriodo.getChildren().add(new TreeItem("Filosofía"));
        cuartoPeriodo.getChildren().add(new TreeItem("Programación II"));
        
        TreeItem quintoPeriodo = new TreeItem("Quinto periodo");
        quintoPeriodo.getChildren().add(new TreeItem("Física II"));
        quintoPeriodo.getChildren().add(new TreeItem("Dibujo I"));
        quintoPeriodo.getChildren().add(new TreeItem("Inglés III"));
        quintoPeriodo.getChildren().add(new TreeItem("Circuitos Eléctricos para Ingenieria en Sistemas"));
        
        TreeItem sextoPeriodo = new TreeItem("Sexto periodo");
        sextoPeriodo.getChildren().add(new TreeItem("Matemática Discreta"));
        sextoPeriodo.getChildren().add(new TreeItem("Dibujo II"));
        sextoPeriodo.getChildren().add(new TreeItem("Estadística"));
        sextoPeriodo.getChildren().add(new TreeItem("Algoritmos y Estructura de datos"));
        
        segundoAnyo.getChildren().add(cuartoPeriodo);
        segundoAnyo.getChildren().add(quintoPeriodo);
        segundoAnyo.getChildren().add(sextoPeriodo);
        
        TreeItem septimoPeriodo = new TreeItem("Septimo periodo");
        septimoPeriodo.getChildren().add(new TreeItem("Programación Orientada a objetos"));
        septimoPeriodo.getChildren().add(new TreeItem("Electrónica para Ing. en sistemas"));
        septimoPeriodo.getChildren().add(new TreeItem("Sistemas Operativos I"));
        septimoPeriodo.getChildren().add(new TreeItem("Campo de las ciencias naturales"));
        
        TreeItem octavoPeriodo = new TreeItem("Octavo periodo");
        octavoPeriodo.getChildren().add(new TreeItem("Base de Datos I"));
        octavoPeriodo.getChildren().add(new TreeItem("Historia de Honduras"));
        octavoPeriodo.getChildren().add(new TreeItem("Instalaciones Eléctricas"));
        octavoPeriodo.getChildren().add(new TreeItem("Redes de datos I"));
        
        TreeItem novenoPeriodo = new TreeItem("Noveno periodo");
        novenoPeriodo.getChildren().add(new TreeItem("Sistemas Operativos II"));
        novenoPeriodo.getChildren().add(new TreeItem("Base de Datos II"));
        novenoPeriodo.getChildren().add(new TreeItem("Arquitectura de computadoras"));
        novenoPeriodo.getChildren().add(new TreeItem("Lenguajes de Programación"));
        
        tercerAnyo.getChildren().add(septimoPeriodo);
        tercerAnyo.getChildren().add(octavoPeriodo);
        tercerAnyo.getChildren().add(novenoPeriodo);
        
        TreeItem decimoPeriodo = new TreeItem("Decimo periodo");
        decimoPeriodo.getChildren().add(new TreeItem("Redes de datos II"));
        decimoPeriodo.getChildren().add(new TreeItem("Diseño Digital"));
        decimoPeriodo.getChildren().add(new TreeItem("Sistema de Información"));
        decimoPeriodo.getChildren().add(new TreeItem("Campo de las Humandades"));
        
        TreeItem dPrimerPeriodo = new TreeItem("Decimo primer periodo");
        dPrimerPeriodo.getChildren().add(new TreeItem("Seguridad Informática"));
        dPrimerPeriodo.getChildren().add(new TreeItem("Administración I "));
        dPrimerPeriodo.getChildren().add(new TreeItem("Analisis y diseño de sistemas"));
        dPrimerPeriodo.getChildren().add(new TreeItem("Optativa I"));
        
        TreeItem dSegundoPeriodo = new TreeItem("Decimo segundo periodo");
        dSegundoPeriodo.getChildren().add(new TreeItem("Contabilidad I"));
        dSegundoPeriodo.getChildren().add(new TreeItem("Auditoría Informática"));
        dSegundoPeriodo.getChildren().add(new TreeItem("Inteligencia Artificial"));
        dSegundoPeriodo.getChildren().add(new TreeItem("Ingeniería del Software"));
        
        cuartoAnyo.getChildren().add(decimoPeriodo);
        cuartoAnyo.getChildren().add(dPrimerPeriodo);
        cuartoAnyo.getChildren().add(dSegundoPeriodo);
        
        TreeItem dTercerPeriodo = new TreeItem("Decimo tercer periodo");
        dTercerPeriodo.getChildren().add(new TreeItem("Finanzas Administrativas"));
        dTercerPeriodo.getChildren().add(new TreeItem("Industria del Software"));
        dTercerPeriodo.getChildren().add(new TreeItem("Gerencia Informática"));
        dTercerPeriodo.getChildren().add(new TreeItem("Optativa II"));
        
        TreeItem dCuartoPeriodo = new TreeItem("Decimo cuarto periodo");
        dCuartoPeriodo.getChildren().add(new TreeItem("Tópicos Especiales y avanzados"));
        dCuartoPeriodo.getChildren().add(new TreeItem("Economía Digital"));
        dCuartoPeriodo.getChildren().add(new TreeItem("ptativa III"));
        dCuartoPeriodo.getChildren().add(new TreeItem("Seminario de Investigación"));
        
        TreeItem dQuintoPeriodo = new TreeItem("Decimo quinto periodo");
        dQuintoPeriodo.getChildren().add(new TreeItem("Teoría de la Simulación"));
        dQuintoPeriodo.getChildren().add(new TreeItem("Microprocesadore"));
        dQuintoPeriodo.getChildren().add(new TreeItem("Liderazgo para el cambio"));
        dQuintoPeriodo.getChildren().add(new TreeItem("Sistemas Expertos"));
        dQuintoPeriodo.getChildren().add(new TreeItem("Diseño de Compiladores"));
        
        quintoAnyo.getChildren().add(dTercerPeriodo);
        quintoAnyo.getChildren().add(dCuartoPeriodo);
        quintoAnyo.getChildren().add(dQuintoPeriodo);
        
        lista.add(primerAnyo);
        lista.add(segundoAnyo);
        lista.add(tercerAnyo);
        lista.add(cuartoAnyo);
        lista.add(quintoAnyo);
        
        return lista;
    }
    
    public void initialize() {

        TreeItem raiz = new TreeItem("Plan de estudios");
        
        raiz.getChildren().addAll(this.ObtenerTodo());
        
        aPlan.setRoot(raiz);
    }
}
