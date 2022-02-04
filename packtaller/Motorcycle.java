package packtaller;

/**
 * Representa una clase Motocicleta y varios de sus atributos y métodos.
 * @author Juan Pablo Allin Cañas
 */
public class Motorcycle {

    /**
     * Representa la marca de la motocicleta.
     */
    public String brand;

    /**
     * Representa el color de la motocicleta.
     */
    public String color;

    /**
     * Representa el estado de la motocicleta.
     */
    public boolean running = false;

    /**
     * Representa el peso de la motocicleta.
     */
    private float weight;

    /**
     * Representa la velocidad de la motocicleta.
     */
    protected int speed;
    
    /**
     * Crea una instancia de la clase Motocicleta.
     * @param brand Marca de la motocicleta. 
     * @param color Color de la motocicleta.
     */
    public Motorcycle( String brand, String color ) {
        this.brand = brand;
        this.color = color;
    }

    /**
     * Enciende la motocicleta.
     */
    public void turnOn() {
        this.running = true;
        System.out.println( "La moto está encendida" );
    }
    
    /**
     * Apaga la motocicleta.
     */
    public void turnOff() {
        this.running = false;
        System.out.println( "La moto está apagada" );
    }
    
    /**
     * Establece el peso de la motocicleta.
     * @param weight Peso de la motocicleta.
     */
    public void setWeight( float weight ) {
        this.weight = weight;
    }

    /**
     * Obtiene el peso de la motocicleta.
     * @return Obtiene el peso de la motocicleta.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Establece la velocidad de la motocicleta.
     * @param speed Velocidad de la motocicleta.
     */
    public void setSpeed( int speed ) {
        this.speed = speed;
    }

    /**
     * Obtiene la velocidad de la motocicleta.
     * @return Obtiene la velocidad de la motocicleta.
     */
    public int getSpeed() {
        return speed;
    }
}

