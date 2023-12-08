package Implementacion;
import Clases.*;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Alumno a1=new Alumno("Kevin", "Garcia","20221002036");
        HistorialAcademico h1=new HistorialAcademico(a1);
        Forma003 f1=new Forma003();
        Seccion s1=new Seccion("Calculo 2", "MM-202", 900, "MM-201");
        Seccion s2=new Seccion("Algoritmos y estructura de datos", "IS-310", 2000, "IS-210");
        Seccion s3=new Seccion("Ecuaciones Diferenciales", "MM-401", 1000, "MM-202");
        
        boolean condicion=true;
       while(condicion){
           System.out.println("---------------- Menú de opciones ----------------\n"
                + "1- Imprimir historial academico\n"
                + "2- Imprimir forma 003\n"
                + "3- Imprimir plan de estudios\n"
                + "4- Matricular una clase\n"
                + "5- Cancelar una clase\n"
                + "6- Agregar asignatura al historial academico\n"
                + "7- Salir");
       int opcion=sc.nextInt(); 
       switch(opcion){
        case 1:
            h1.imprimirAsignatura();
            break;
        case 2:
            System.out.println(a1);
            System.out.println("Asignaturas Matriculadas: ");
            f1.mostrarAsignaturas();
            break;
        case 3:
            PlanDeEstudios p1=new PlanDeEstudios();
            p1.imprimirPlan();
            break;
        case 4:
            System.out.println("Seleccione la seccion en la que desea matricularse");
            System.out.println("1- "+s1.toString());
            System.out.println("2- "+s2.toString());
            System.out.println("3- "+s3.toString());
            int opcion1=sc.nextInt();
            if(opcion1==1){
                if(s1.getCupos()!=0){
                    if(!f1.buscarClase(s1.getNombreClase())){
                        if(h1.buscarAsignatura(s1.getRequisito1())){
                            System.out.println("Matricula realizada con exito");
                            f1.agregarClaseMatriculada(s1);
                            s1.setCupos(s1.getCupos()-1);
                            }else{
                                System.out.println("No cumple los requisitos para matricular la clase");
                            }    
                            }else{
                        System.out.println("La asignatura ya fue matriculada");
                    }
                            }else{
                                System.out.println("Error: La clase no tiene cupos disponibles");
                    }
                
            }
            if(opcion1==2){
                if(s2.getCupos()!=0){
                    if(!f1.buscarClase(s2.getNombreClase())){
                        if(h1.buscarAsignatura(s2.getRequisito1())){
                            System.out.println("Matricula realizada con exito");
                            f1.agregarClaseMatriculada(s2);
                            s2.setCupos(s2.getCupos()-1);
                            }else{
                            System.out.println("No cumple los requisitos para matricular la clase");
                            }
                            }else{
                        System.out.println("La asignatura ya fue matriculada");
                    }
                            }else{
                            System.out.println("Error: La clase no tiene cupos disponibles");    
                    }
                    
                
            }
            if(opcion1==3){
                if(s3.getCupos()!=0){
                    if(!f1.buscarClase(s3.getCodigoClase())){
                        if(h1.buscarAsignatura(s3.getRequisito1())){
                            System.out.println("Matricula realizada con exito");
                            f1.agregarClaseMatriculada(s3);
                            s3.setCupos(s3.getCupos()-1);
                            }else{
                            System.out.println("No cumple los requisitos para matricular la clase");
                            }    
                            }else{
                            System.out.println("La clase ya fue matriculada");
                            }
                            }else{
                            System.out.println("Error: la clase no tiene cupos");
                            }
            }
            break;
        case 5:
            System.out.println("Seleccione la clase matriculada que desea eliminar");
            f1.mostrarAsignaturas();
            int clase=sc.nextInt();
            if(clase>0&&f1.cantidadClases()>=clase){
                f1.eliminarPorIndice(clase-1);
                System.out.println("Clase cancelada");
            }else{
                System.out.println("Opcion incorrecta");
            }
            
            break;
        case 6:
            System.out.println("Ingrese el codigo de la clase");
            String codigo=sc2.nextLine();
            System.out.println("Ingrese el nombre de la clase");
            String nombre=sc2.nextLine();
            if(!h1.buscarAsignatura(codigo)){
                h1.agregarAsignatura(codigo, nombre);
                System.out.println("Asignatura agregada con exito");
            }else{
                System.out.println("Esta asignatura ya forma parte de el historial academico");
            }
            break;
        case 7:
            condicion=false;
        default: System.out.println("La opcion es incorrecta");
        }
    }
    }
}
