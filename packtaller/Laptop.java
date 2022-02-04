package packtaller;

/**
 * Representa una clase Laptop y varios de sus atributos y métodos.
 * @author Juan Pablo Allin Cañas
 */
public class Laptop {
    
    /**
     * Representa la marca de la laptop.
     */
    public String brand;

    /**
     * Representa el modelo de la laptop.
     */
    public String model;

    /**
     * Representa la capacidad de almacenamiento en el disco duro de la laptop. (GB)
     */
    private int storage;

    /**
     * Representa la memoria RAM de la laptop. (GB)
     */
    protected int ram;

    /**
     * Crea una instancia de la clase Laptop.
     * @param brand Marca de la laptop.
     * @param model Modelo de la laptop.
     */
    public Laptop( String brand, String model ) {
        this.brand = brand;
        this.model = model;
    }

    /**
     * Establece la capacidad de almacenamiento en el disco duro de la laptop.
     * @param storage Capacidad de almacenamiento.
     */
    public void setStorage( int storage ) {
        this.storage = storage;
    }

    /**
     * Obtiene la capacidad de almacenamiento en el disco duro de la laptop.
     * @return Capacidad de almacenamiento en el disco duro de la laptop.
     */
    public int getStorage() {
        return storage;
    }

    /**
     * Establece la cantidad de memoria RAM de la laptop.
     * @param ram Memoria RAM.
     */
    public void setRam( int ram ) {
        this.ram = ram;
    }

    /**
     * Obtiene la cantidad de memoria RAM de la laptop.
     * @return Cantidad de memoria RAM de la laptop.
     */
    public int getRam() {
        return ram;
    }   
}
