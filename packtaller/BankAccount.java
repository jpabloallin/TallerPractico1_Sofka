package packtaller;

/**
 * Representa una clase Cuenta Bancaria y varios de sus atributos y métodos.
 * @author Juan Pablo Allin Cañas
 */
public class BankAccount {

    /**
     * Representa el número de la cuenta bancaria.
     */
    private int accountNumber;

    /**
     * Representa el estado de activación de la cuenta bancaria.
     */
    protected boolean activated;

    /**
     * Establece el estado de activación de la cuenta bancaria.
     * @param activated Estado de activación de la cuenta bancaria.
     */
    public void setActivated( boolean activated ) {
        this.activated = activated;
    }

    /**
     * Obtiene el estado de activación de la cuenta bancaria.
     * @return Obtiene el estado de activación de la cuenta bancaria.
     */
    public boolean getActivated() {
        return this.activated;
    }

    /**
     * Conoce el estado de la cuenta bancaria.
     */
    public void bankAccountStatus() {
        if ( this.activated == true ) {
            System.out.println( "La cuenta bancaria está activada" );
        }   
        else {
            System.out.println( "La cuenta bancaria está desactivada" );
        }
    }
}
