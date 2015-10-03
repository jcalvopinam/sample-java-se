package com.beans;

public class Persona implements Comparable<Persona>{

    String nombre;
    Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Persona(String nombre, Integer edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nPersona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + edad;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (edad != other.edad)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public int compareTo(Persona persona) {
//        return nombre.compareTo(persona.getNombre());
        return edad.compareTo(persona.getEdad());
    }



}
