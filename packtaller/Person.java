package packtaller;

import java.util.Date;

/**
 * Representa una clase Persona y varios de sus atributos y métodos.
 * @author Juan Pablo Allin Cañas
 */
public class Person {

    /**
     * Representa el nombre de la persona.
     */
    public String name;

    /**
     * Representa los apellidos de la persona.
     */
    public String lastName;
    public String lastName2;

    /**
     * Representa la fecha de nacimiento de la persona.
     */
    public Date dateBirth;

    /**
     * Representa el peso de la persona.
     */
    public float height;

    /**
     * Crea una instancia de la clase Persona.
     * @param lastName Primer apellido de la persona.
     * @param lastName2 Segundo apellido de la persona.
     * @param height Peso de la persona.
     */
    public Person( String lastName, String lastName2, float height ) {
        this.lastName = lastName;
        this.lastName2 = lastName2;
        this.height = height;
    }

    /**
     * Establece el nombre de la persona.
     * @param name Nombre de la persona.
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * Obtiene el nombre de la persona.
     * @return Obtiene el nombre de la persona.
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Muestra los datos de la persona.
     */
    public void showPersonData(){
        System.out.println( "El primer apellido es: " + this.lastName );
        System.out.println( "El segundo apellido es: " + this.lastName2 );
        System.out.println( "El peso es: " + this.height + " Kg" );
    }
}


