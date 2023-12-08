package Clases;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class PlanDeEstudios {
    ArrayList<String> plan = new ArrayList<>();
    
        public PlanDeEstudios(){
            plan.add("Primer periodo");
            plan.add("Matemáticas I"+ 
                    "Geometría y Trigonometría."+
                    "Introducción. a la Ingeniería en Sistemas"+
                    "Sociología");
            plan.add("Segundo periodo");
            plan.add("Vectores y Matrices\n" +
                    "Inglés I\n" +
                    "Cálculo I\n" +
                    "Campo de las Deportes");
            plan.add("Tercer periodo");
            plan.add("Cálculo II\n" +
                    "Inglés II\n" +
                    "Programación I \n" +
                    "Español General 1");
            plan.add("Cuarto periodo");
            plan.add("Física I\n" +
                    "Ecuaciones Diferenciales\n" +
                    "Programación II \n" +
                    "Filosofía");
            plan.add("Quinto periodo");
            plan.add("Inglés III\n" +
                    "Dibujo I\n" +
                    "Física II\n" +
                    "Circuitos Eléctricos para\n" +
                    "Ingenieria en Sistemas");
            plan.add("Sexto periodo");
            plan.add("Matemática Discreta\n" +
                    "Dibujo II\n" +
                    "Estadística\n" +
                    "Algoritmos y Estructura\n" +
                    "de Datos");
            plan.add("Septimo periodo");
            plan.add("Programación Orientada \n"+
                    "a Objetos\n" +
                    "Electrónica para Ing. en\n" +
                    "Sistemas \n" +
                    "Sistemas Operativos I\n" +
                    "Campo de las Ciencias \n" +
                    "Naturales");
            plan.add("Octavo periodo");
            plan.add("Base de Datos I \n" +
                    "Historia de Honduras\n" +
                    "Instalaciones Eléctricas\n" +
                    "Redes de Datos I ");
            plan.add("Noveno periodo");
            plan.add("Sistemas Operativos II\n" +
                    "Base de Datos II \n" +
                    "Arquitectura de \n" +
                    "Computadoras \n" +
                    "Lenguajes de Programación ");
            plan.add("Decimo periodo");
            plan.add("Redes de Datos II\n" +
                    "Diseño Digital\n" +
                    "Sistema de Información\n" +
                    "Campo de las Humandades");
            plan.add("Decimo primer periodo");
            plan.add("Seguridad Informática\n" +
                    "Administración I \n" +
                    "Análisis y Diseño de\n" +
                    "Sistemas\n" +
                    "Optativa I");
            plan.add("Decimo segundo periodo");
            plan.add("Contabilidad I\n" +
                    "Auditoría Informática\n" +
                    "Inteligencia Articial\n" +
                    "Ingeniería del Software");
            plan.add("Decimo tercer periodo");
            plan.add("Finanzas Administrativas\n" +
                    "Industria del Software\n" +
                    "Gerencia Informática\n" +
                    "Optativa II ");
            plan.add("Decimo cuarto periodo");
            plan.add("Tópicos Especiales y \n" +
                    "Avanzados\n" +
                    "Economía Digital\n" +
                    "Optativa III\n" +
                    "Seminario de Investigación");
            plan.add("Decimo quinto periodo");
            plan.add("Teoría de la Simulación\n" +
                    "Microprocesadores\n" +
                    "Liderazgo para el cambio\n" +
                    "Sistemas Expertos\n" +
                    "Diseño de Compiladores");
        }
        public void imprimirPlan (){
            System.out.println(plan);
        }
}
