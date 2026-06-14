package UI;
import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;
public class Main {


public static void main (String[] args) {
    GestorDatos gestor = new GestorDatos();
    // carga la lista ubicado en resources
    ArrayList<Tour> misTours = gestor.cargarTour("src/resources/Tour.txt");
    System.out.println("  Catalogo Completo    ");
    for (Tour t : misTours) {
        System.out.println(t.toString());

    }
    System.out.println("\n---- Filtrado Tours de Aventura ---- ");
    boolean encontrado = false;

    if (!encontrado) {
        System.out.println("Encontrado: " +  misTours.toString());


    }


}



}


