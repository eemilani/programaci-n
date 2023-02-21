public class ejercicio5HerenciaClase {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes();
        cliente1.edad = 35;
        cliente1.telefono = 154157699;
        cliente1.nombre = "Ezequiel Milani";
        cliente1.credito = 350000;
        System.out.println("Cliente:");
        System.out.println(cliente1.edad);
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);

        Trabajadores trabajador1 = new Trabajadores();
        trabajador1.edad = 40;
        trabajador1.telefono = 154653489;
        trabajador1.nombre = "Rogelio Garcia";
        trabajador1.salario = 200000;
        System.out.println("Tabajador:");
        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.salario);
    }
}
class Personas {

    int edad;
    String nombre;
    int telefono;
}
class Clientes extends Personas {
    int credito;
}
class Trabajadores extends Personas {
    int salario;
}