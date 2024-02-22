package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.exception.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

public abstract class VisualiseurTerrain {
    // Attributs pour stocker le détermineur de terrain et la carte
    private DetermineurTerrain determineurTerrain;
    private Carte carte;

    // Constructeur prenant une carte et un détermineur de terrain en paramètres
    public VisualiseurTerrain(Carte carte, DetermineurTerrain determineurTerrain){
        this.carte=carte;
        this.determineurTerrain=determineurTerrain;
    }

    // Méthode abstraite pour obtenir l'altitude affichée d'un point de la carte
    public abstract AltitudeAffichee getAltitudeAffichee(int x, int y) throws TerrainInexistant;

    // Méthode abstraite pour obtenir l'hydrométrie affichée d'un point de la carte
    public abstract HydrometrieAffichee getHydrometrieAffichee(int x, int y) throws TerrainInexistant;

    // Méthode abstraite pour obtenir la température affichée d'un point de la carte
    public abstract TemperatureAffichee getTemperatureAffichee(int x, int y) throws TerrainInexistant;

    // Méthode abstraite pour obtenir le type de terrain d'un point de la carte
    public abstract TypeTerrain getTypeTerrain(int x, int y) throws TerrainInexistant;

    // Méthode pour obtenir le détermineur de terrain
    public DetermineurTerrain getDetermineurTerrain() {
        return determineurTerrain;
    }

    // Méthode pour obtenir la carte
    public Carte getCarte() {
        return carte;
    }
}
