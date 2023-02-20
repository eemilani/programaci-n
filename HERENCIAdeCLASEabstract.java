public class HERENCIAdeCLASE {
    public static void main(String[] args) {
        JEEPNIETO jeepnieto1 = new JEEPNIETO();
        jeepnieto1.velocidadActual = 0;
        jeepnieto1.velocidadMaxima = 220;
        jeepnieto1.patente = "ABC 1234 ES";
        System.out.println(jeepnieto1.comprobarPatente("NSP 812"));
        jeepnieto1.setSonido("RUUUMM");
        System.out.println(jeepnieto1.getSonido());

        JEEPELECTRICO jeepelectrico1 = new JEEPELECTRICO();
        jeepelectrico1.setSonido("wiiiii");
        System.out.println(jeepelectrico1.getSonido());
    }
}
class JEEPSPADRE {
    int velocidadMaxima;
    String patente;
    public boolean comprobarPatente(String patente) {
        if (patente == "XXX") {
            return true;
        }
        return false;
    }
}
abstract class JEEPSHIJO extends JEEPSPADRE {
    int velocidadMinima = 0;
    String sonido;
    abstract public String getSonido();
    abstract public void setSonido(String sonido);
}
class JEEPNIETO extends JEEPSHIJO {
    int velocidadActual = 0;
    public String getSonido() {
        return "Sonido fuerte: " + this.sonido;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
class JEEPELECTRICO extends JEEPSHIJO {

    public String getSonido() {
        return "Sonido suave: " + this.sonido;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}