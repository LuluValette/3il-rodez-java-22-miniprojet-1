package fr.ecole3il.rodez2023.perlin.math;

import java.util.Random;

/**
 * La classe BruitAleatoire étend la classe Bruit2D et génère du bruit aléatoire en deux dimensions.
 * Elle utilise la classe Random de Java pour générer des valeurs aléatoires.
 */
public class BruitAleatoire extends Bruit2D {

    /** Instance de la classe Random pour générer des valeurs aléatoires */
    private final Random random;

    /**
     * Constructeur de la classe BruitAleatoire.
     * @param graine La graine utilisée pour initialiser le générateur de bruit.
     * @param resolution La résolution utilisée pour initialiser le générateur de bruit.
     */
    public BruitAleatoire(long graine, double resolution) {
        // Appel du constructeur de la classe mère avec la graine et la résolution fournies
        super(graine, resolution);
        // Initialisation de l'instance de Random avec la graine fournie
        this.random = new Random(graine);
    }

    /**
     * Méthode pour générer du bruit aléatoire en deux dimensions.
     * @param x Coordonnée x pour laquelle obtenir le bruit.
     * @param y Coordonnée y pour laquelle obtenir le bruit.
     * @return Une valeur de bruit aléatoire en deux dimensions.
     */
    @Override
    public double bruit2D(double x, double y) {
        // Utilisation de la méthode nextDouble() de l'objet Random pour générer du bruit aléatoire
        return random.nextDouble();
    }
}
