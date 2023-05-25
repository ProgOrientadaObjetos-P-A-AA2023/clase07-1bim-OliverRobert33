package paquete5;

public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "ciudad.data";

        Ciudad c1 = new Ciudad("Loja", "Loja");
        Ciudad c2 = new Ciudad("Machala", "El Oro");
        Ciudad c3 = new Ciudad("Jipijapa", "Manabi");
        Ciudad c4 = new Ciudad("Zamora", "Zamora");
        Ciudad c5 = new Ciudad("Cuenca", "Azuay");

        Hospital h1 = new Hospital("Isidro Ayora", 50, 5000.89);
        Hospital h2 = new Hospital("Santa Ines", 100, 3488.89);
        Hospital h3 = new Hospital("San Pablo", 60, 346.89);
        Hospital h4 = new Hospital("Biomedic ", 40, 3246.89);
        Hospital h5 = new Hospital("Hospital Catamayo", 30, 45.89);

        h1.establecerCiudad(c1);
        h2.establecerCiudad(c2);
        h3.establecerCiudad(c3);
        h4.establecerCiudad(c4);
        h5.establecerCiudad(c5);

        Hospital[] lista = {h1, h2, h3, h4, h5};
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);

    }
}
