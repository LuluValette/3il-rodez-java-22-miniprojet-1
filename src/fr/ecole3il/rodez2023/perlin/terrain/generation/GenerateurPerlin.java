package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurPerlin extends GenerateurCarte {
    // Bruits Perlin 2D pour chaque composante de terrain
    BruitPerlin2D bruitPerlinHydrometrie;
    BruitPerlin2D bruitPerlinTemperature;
    BruitPerlin2D bruitPerlinAltitude;
    BruitPerlin2D bruitPerlinDetails;
    BruitPerlin2D bruitPerlinForms;

    // Constructeur prenant une graine en paramètre
    public GenerateurPerlin(long graine) {
        // Appel du constructeur de la classe parent avec la graine
        super(graine);
        // Calcul des graines pour les différents bruits Perlin
        long graineDetails = graine * 3;
        long graineForms = graine * 4;
        // Initialisation des bruits Perlin avec les graines calculées
        bruitPerlinHydrometrie = new BruitPerlin2D(graine, 1);
        bruitPerlinTemperature = new BruitPerlin2D(graine * 2, 1);
        bruitPerlinAltitude = new BruitPerlin2D(graine * 4, 1);
        bruitPerlinForms = new BruitPerlin2D(graineForms, 1);
        bruitPerlinDetails = new BruitPerlin2D(graineDetails, 1);
    }

    // Méthode pour générer un terrain en utilisant la méthode Perlin
    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        // Calcul des coordonnées normalisées
        double x = (double) i / largeur;
        double y = (double) j / hauteur;

        // Génération des composantes de terrain à l'aide des bruits Perlin
        double altitude = bruitPerlinAltitude.bruit2D(x, y);
        double hydrometrie = Math.abs(bruitPerlinHydrometrie.bruit2D(x, y));
        double temperature = Math.abs(bruitPerlinTemperature.bruit2D(x, y));

        // Création et retour du terrain avec les composantes générées
        return new Terrain(altitude, hydrometrie, temperature);
    }
}
