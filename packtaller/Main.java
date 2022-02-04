package packtaller;

/**
 * Representa una clase Main para la creación de objetos de las clases del paquete packtaller y ejecutar algunas funcionalidades.
 * @author Juan Pablo Allin Cañas
 */
public class Main {
    
    public static void main( String[] args ) {
        
        /**
         * Creación de un objeto de la clase Persona con tres parámetros.
         */
        Person p = new Person( "Allin", "Cañas", 70 );

        /**
         * Establece el nombre de la persona.
         */
        p.setName( "Juan Pablo" );

        /**
         * Imprime el nombre de la persona.
         */
        System.out.println( "El nombre es: " + p.getName() );

        /**
         * Ejecuta el método para imprimir los datos de la persona.
         */
        p.showPersonData();

        /**
         * Creación de un objeto de la clase Fruta con el parámetro nombre.
         */
        Fruit f = new Fruit("Pera");

        /**
         * Imprime el nombre de la fruta.
         */
        System.out.println( "El nombre de la fruta es: " + f.name );

        /**
         * Creaciónde un objeto de la clase Cuenta Bancaria.
         */
        BankAccount b = new BankAccount();

        /**
         * Cambio de estado de la cuenta bancaria.
         */
        b.setActivated(true);

        /**
         * Imprime el estado de activación de la cuenta bancaria.
         */
        b.bankAccountStatus();

        /**
         * Creación de un objeto de la clase Motocicleta con dos parámetros.
         */
        Motorcycle m = new Motorcycle( "Pulsar","Negra" );

        /**
         * Imprime la marca y el color de la motocicleta.
         */
        System.out.println( "La marca de la moto es " +m.brand + " y es de color " + m.color );
        
        /**
         * Encience la motocicleta.
         */
        m.turnOn();

        /**
         * Apaga la motocicleta.
         */
        m.turnOff();

        /**
         * Creación de un objeto de la clase Película con dos parámetros.
         */
        Movie movie = new Movie( "Interestelar", "Ciencia Ficción" );

        /**
         * Establece como parámetro la duración de la película.
         */
        movie.setDuration(169);

        /**
         * Imprime el  nombre de la película y obtiene la duración de la misma.
         */
        System.out.println( "La película "+ movie.title + " tiene una duración de "+ movie.getDuration() + " minutos" );
    
        /**
         * Creación de un objeto de la clase Laptop con dos parámetros.
         */
        Laptop l = new Laptop( "Asus","AMD Ryzen 5" );

        /**
         * Imprime la marca y el modelo de la laptop.
         */
        System.out.println("Marca: "+ l.brand + "\n" + "Modelo: "+ l.model);
    }
}
