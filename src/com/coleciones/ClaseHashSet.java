package com.coleciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.beans.Persona;

public class ClaseHashSet {

    public static void main(String[] args) {
        Persona p1 = new Persona("Andrea", 25);
        Persona p2 = new Persona("Carolina", 24);
        Persona p3 = new Persona("Annabel", 25);
        Persona p4 = new Persona("Cristina", 23);
        Persona p5 = new Persona("Veronica", 27);
        Persona p6 = new Persona("Patricia", 28);

//        Set<Persona> personas = new HashSet<Persona>();
        List<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);

        imprimir(personas);
        personas.add(new Persona("Veronica", 30));
        personas.remove(p5);
        Collections.sort(personas);
        imprimir(personas);
        Collections.sort(personas, Collections.reverseOrder());
        imprimir(personas);
    }

    @SuppressWarnings("unused")
    private static void imprimir(Set<Persona> personas) {
        System.out.println("\ninicio: " + personas.size());
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", edad: " + persona.getEdad());
        }
        System.out.println("fin\n\n");
    }
    
    private static void imprimir(List<Persona> personas) {
        System.out.println("\ninicio: " + personas.size());
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", edad: " + persona.getEdad());
        }
        System.out.println("fin\n\n");
    }

}
