package data;



import model.Tour;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDatos {

    public ArrayList<Tour> cargarTour(String rutaArchivo) {

        ArrayList<Tour> list = new ArrayList<>();

        try {

            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();
                String[] partes = linea.split(";");

                if (partes.length == 3) {

                    String nombre = partes[0];
                    String tipo = partes[1];
                    int precio = Integer.parseInt(partes[2]);

                    list.add(new Tour(nombre, tipo, precio));
                }
            }

            lector.close();

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return list;
    }

}