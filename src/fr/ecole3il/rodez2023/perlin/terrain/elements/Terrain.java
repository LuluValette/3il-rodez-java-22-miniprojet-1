package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.exception.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class Terrain {
    // Attributs de la classe Terrain
    private double altitude;
    private double hydrometrie;
    private double temperature;

    // Constructeur de la classe Terrain
    public Terrain(double altitude, double hydrometrie, double temperature) throws MauvaiseValeurException {
        // Vérification des valeurs d'altitude, d'hydrométrie et de température
        if (altitude < -1 || altitude > 1) {
            throw new MauvaiseValeurException(altitude);
        } else if (hydrometrie < 0 || hydrometrie > 1) {
            throw new MauvaiseValeurException(hydrometrie);
        } else if (temperature < 0 || temperature > 1) {
            throw new MauvaiseValeurException(temperature);
        }
        // Initialisation des attributs de la classe avec les valeurs fournies
        this.altitude = altitude;
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
    }

    // Méthode pour obtenir le type de terrain en utilisant un détermineur de terrain spécifié
    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {
        // Appel de la méthode determinerTerrain du détermineur de terrain avec les valeurs d'altitude, d'hydrométrie et de température
        return dt.determinerTerrain(altitude, hydrometrie, temperature);
    }

    // Méthodes d'accès aux attributs
    public double getAltitude() {
        return altitude;
    }

    public double getHydrometrie() {
        return hydrometrie;
    }

    public double getTemperature() {
        return temperature;
    }
}
