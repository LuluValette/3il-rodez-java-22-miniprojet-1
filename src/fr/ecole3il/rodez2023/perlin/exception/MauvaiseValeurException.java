package fr.ecole3il.rodez2023.perlin.exception;

/**
 * Classe MauvaiseValeurException qui étend IllegalArgumentException.
 * Elle est utilisée pour gérer l'exception lorsque l'une des valeurs de température, altitude et hydrométrie
 * n'est pas comprise entre les valeurs autorisées.
 *
 * @author Luc VALETTE
 */
public class MauvaiseValeurException extends IllegalArgumentException {

    // Attribut privé pour stocker l'objet concerné par l'exception
    private final Object object;

    /**
     * Constructeur de la classe MauvaiseValeurException.
     *
     * @param object L'objet concerné par l'exception.
     */
    public MauvaiseValeurException(Object object) {
        // Appel du constructeur de la classe mère avec un message d'erreur approprié
        super("Valeur incorrecte : " + object);
        // Initialisation de l'attribut object avec la valeur fournie en paramètre
        this.object = object;
    }

    /**
     * Méthode pour récupérer l'objet concerné par l'exception.
     *
     * @return L'objet concerné par l'exception.
     */
    public Object getObject() {
        return object;
    }
}
