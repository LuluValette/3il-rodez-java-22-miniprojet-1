package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.exception.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import java.util.Random;

public class GenerateurAleatoire extends GenerateurCarte {
    // Instance de Random pour générer des valeurs aléatoires
    Random valeurAleatoire;

    // Constructeur prenant une graine en paramètre
    public GenerateurAleatoire(long graine) {
        // Appel du constructeur de la classe parent avec la graine
        super(graine);
        // Initialisation de la valeur aléatoire avec la graine
        this.valeurAleatoire = new Random(graine);
    }

    // Méthode pour générer un terrain en utilisant des valeurs aléatoires
    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        // Génération d'une altitude aléatoire entre -1 et 1
        double altitude = this.valeurAleatoire.nextDouble() * 2 - 1;
        // Génération d'une hydrométrie aléatoire entre 0 et 1
        double hydrometrie = this.valeurAleatoire.nextDouble();
        // Génération d'une température aléatoire entre 0 et 1
        double temperature = this.valeurAleatoire.nextDouble();

        try {
            // Création d'un terrain avec les valeurs générées
            return new Terrain(altitude, hydrometrie, temperature);
        } catch (MauvaiseValeurException e) {
            // En cas d'erreur lors de la création du terrain, affichage de la trace de l'erreur
            e.printStackTrace();
            // Retourne null en cas d'erreur
            return null;
        }
    }
}
