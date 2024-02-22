package fr.ecole3il.rodez2023.perlin.exception;

/**
 * Classe TerrainInexistant qui étend IndexOutOfBoundsException.
 * Elle est utilisée pour lever l'exception lorsqu'il n'y a pas de terrain en entrée de méthode.
 *
 * @author Luc VALETTE
 */
public class TerrainInexistant extends IndexOutOfBoundsException {

    /**
     * Constructeur de la classe TerrainInexistant.
     *
     * @param s Le message d'erreur à associer à l'exception.
     */
    public TerrainInexistant(String s) {
        // Appel du constructeur de la classe mère avec le message d'erreur fourni en paramètre
        super(s);
    }
}
