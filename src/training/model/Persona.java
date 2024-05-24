package training.model;

public class Persona {

    private String nombre;
    private long dni;
    private String occupation;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }



    public Persona(String nombre, long dni, String occupation) {
        this.nombre = nombre;
        this.dni = dni;
        this.occupation = occupation;
    }

    public Persona() {

    }



}
