package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.Utils;

import java.awt.image.BufferedImage;

public enum TypeTerrain {
    // Définition des types de terrain
    COLLINES,
    DESERT,
    FORET_DE_CONIFERES,
    FORET_DE_FEUILLUS,
    MARAIS,
    MONTAGNE,
    OCEAN,
    PLAINE,
    TOUNDRA;

    // Méthode pour obtenir l'image correspondante à chaque type de terrain
    public BufferedImage getImage() {
        // Nom de fichier par défaut pour l'image
        String nomFichier = "";
        // Sélection du nom de fichier en fonction du type de terrain
        switch(this) {
            case COLLINES:
                nomFichier = "hills.png";
                break;

            case DESERT:
                nomFichier = "desert.png";
                break;

            case FORET_DE_CONIFERES:
                nomFichier = "coniferous_forest.png";
                break;

            case FORET_DE_FEUILLUS:
                nomFichier = "deciduous_forest.png";
                break;

            case MARAIS:
                nomFichier = "marsh.png";
                break;

            case MONTAGNE:
                nomFichier = "mountain.png";
                break;

            case OCEAN:
                nomFichier = "ocean.png";
                break;

            case PLAINE:
                nomFichier = "plain.png";
                break;

            case TOUNDRA:
                nomFichier = "tundra.png";
                break;
        }
        // Chargement de l'image à partir du fichier correspondant
        return Utils.chargerTuile(nomFichier);
    }

    // Méthode pour obtenir une représentation textuelle du type de terrain
    @Override
    public String toString() {
        // Sélection de la représentation textuelle en fonction du type de terrain
        switch(this) {
            case COLLINES:
                return "Collines";
            case DESERT:
                return "Désert";
            case FORET_DE_CONIFERES:
                return "Forêt de conifères";
            case FORET_DE_FEUILLUS:
                return "Forêt de feuillus";
            case MARAIS:
                return "Marais";
            case MONTAGNE:
                return "Montagne";
            case OCEAN:
                return "Océan";
            case PLAINE:
                return "Plaine";
            case TOUNDRA:
                return "Toundra";
        }
        // Retourne une chaîne vide par défaut
        return "";
    }
}
