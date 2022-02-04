package packtaller;

/**
 * Representa una clase Película y varios de sus atributos y métodos.
 * @author Juan Pablo Allin Cañas
 */
public class Movie {

    /**
     * Representa el título de la película.
     */
    public String title;

    /**
     * Representa el género de la película.
     */
    public String genre;

    /**
     * Representa la duración de la película.
     */
    private float duration;

    /**
     * Representa el nombre del director de la película.
     */
    protected String directorName;

    /**
     * Crea una instancia de la clase Película.
     * @param title Título de la película.
     * @param genre Género de la película.
     */
    public Movie( String title, String genre ) {
        this.title = title;
        this.genre = genre;
    }

    /**
     * Establece la duración de la película.
     * @param duration Duración de la película. (min)
     */
    public void setDuration( float duration ) {
        this.duration = duration;
    }

    /**
     * Obtiene la duración de la película.
     * @return Obtiene la duración de la película.
     */
    public float getDuration() {
        return duration;
    }

    /**
     * Establece el director de la película.
     * @param directorName Nombre del director de la película.
     */
    public void setDirectorName( String directorName ) {
        this.directorName = directorName;
    }

    /**
     * Obtiene el nombre del director de la película.
     * @return Obtiene el nombre del director de la película.
     */
    public String getDirectorName() {
        return directorName;
    }
}

