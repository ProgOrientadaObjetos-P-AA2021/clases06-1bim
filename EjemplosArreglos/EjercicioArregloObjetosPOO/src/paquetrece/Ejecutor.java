/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetrece;


public class Ejecutor {
    public static void main(String[] args) {
              
        
        Calificacion c1 = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(10, "Lógica");
        Calificacion c3 = new Calificacion(10, "Literatura");
        
        Profesor profesor1 = new Profesor("Tara Hernandez", "contratado");
        Profesor profesor2 = new Profesor("Gregory Walsh", "nombramiento");
        Profesor profesor3 = new Profesor("Kevin Page", "nombramiento");
        
        c1.establecerProfesor(profesor1);
        c2.establecerProfesor(profesor2);
        c3.establecerProfesor(profesor3);
                
        Calificacion [] lista2 = {c1, c1, c1};
        
        c3.establecerProfesor(profesor1);
        Calificacion [] lista = {c1, c2, c3};
        
        LibretaCalificacion libreta1 = new LibretaCalificacion("Justin Powers",
                lista);
        libreta1.establecerCalificaciones(lista2);
        libreta1.establecerCalificaciones(lista);
        libreta1.establecerPromedio();
        libreta1.establecerPromedioCualitativo();
        System.out.println(libreta1);
        
    }
}
