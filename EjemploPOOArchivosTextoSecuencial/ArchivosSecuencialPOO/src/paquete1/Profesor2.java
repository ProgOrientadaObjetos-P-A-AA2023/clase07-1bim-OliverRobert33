package paquete1;

public class Profesor2 {

    private String nombre;
    private String tipo;
    private int edad;

    public Profesor2(String n, String t, int e) {
        nombre = n;
        tipo = t;
        edad = e;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d", nombre, tipo, edad);
    }
}
