package net.salesianos.persona;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getedad() {
        return edad;
    }
    
    public void setedad(int edad) {
        this.edad = edad;
    }

    public String getapellidos() {
        return apellidos;
    }

    public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }
      public String getnombre() {
        return nombre.toUpperCase();
    }

}
