package fr.ecole3il.rodez2023.perlin.terrain.carte;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import fr.ecole3il.rodez2023.perlin.Utils;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

/**
 * La classe ManipulateurCarte fournit des méthodes pour charger et enregistrer des cartes.
 * Elle permet de manipuler des objets Carte en utilisant des fichiers sur le disque.
 *
 * @author proussille
 */
public class ManipulateurCarte {

    /**
     * Charge une carte à partir d'un fichier spécifié.
     * @param cheminFichier Le chemin vers le fichier contenant les données de la carte.
     * @return Une instance de Carte chargée à partir du fichier.
     */
    public static Carte chargerCarte(String cheminFichier) {
        // Utilisation de la méthode lireContenuFichier de la classe Utils pour lire le contenu du fichier
        return new Carte(Utils.lireContenuFichier(cheminFichier));
    }

    /**
     * Enregistre une carte dans un fichier spécifié.
     * @param carte La carte à enregistrer.
     * @param cheminFichier Le chemin vers le fichier où la carte sera enregistrée.
     */
    public static void enregistrerCarte(Carte carte, String cheminFichier) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cheminFichier))) {
            // Écriture des métadonnées de la carte (nom, largeur, hauteur)
            writer.write(carte.getNom() + "\n");
            writer.write(carte.getLargeur() + "\n");
            writer.write(carte.getHauteur() + "\n");

            // Écriture des éléments de terrain
            for (int y = 0; y < carte.getHauteur(); y++) {
                for (int x = 0; x < carte.getLargeur(); x++) {
                    Terrain terrain = carte.getTerrain(x, y);
                    // Écriture des données d'altitude, d'hydrométrie et de température du terrain
                    writer.write(terrain.getAltitude() + " ");
                    writer.write(terrain.getHydrometrie() + " ");
                    writer.write(terrain.getTemperature() + "\n");
                }
            }
        } catch (IOException e) {
            // En cas d'erreur lors de l'enregistrement, afficher la trace de l'erreur
            e.printStackTrace();
        }
    }
}
