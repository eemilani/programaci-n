public class ejercicio4ClasePersona {
    public static void  main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(35);
        persona1.setNombre("Ezequiel");
        persona1.setTelefono(154157699);
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        this.edad = edad;
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        this.nombre = nombre;
        return nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        this.telefono = telefono;
        return telefono;
    }
}