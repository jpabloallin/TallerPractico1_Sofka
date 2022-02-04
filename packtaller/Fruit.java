package packtaller;

import java.util.ArrayList;

/**
 * Representa una clase Fruta y varios de sus atributos y métodos.
 * @author Juan Pablo Allin Cañas
 */
public class Fruit {

    /**
     * Representa el nombre de la fruta.
     */
    public String name;

    /**
     * Representa el peso promedio de la fruta.
     */
    private float averageWeight;

    /**
     * Representa los colores de la fruta en una lista.
     */
    public ArrayList<String> colors = new ArrayList<String>();

    /**
     * Crea una instancia de la clase Fruta.
     * @param name Nombre de la fruta.
     */
    public Fruit( String name ) {
        this.name = name;
    }

    /**
     * Establece colores a la fruta.
     * @param colors Color de la fruta.
     */
    public void setColors( ArrayList<String> colors ) {
        this.colors = colors;
    }
    
    /**
     * Obtiene los colores de la fruta.
     * @return Obtiene los colores de la fruta.
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }
}

