package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.exception.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

import java.util.Locale;
import java.util.Scanner;

public class Carte {
    // Attributs de la classe
    private String nom;
    private int largeur;
    private int hauteur;
    private Terrain[][] terrains;

    // Méthodes d'accès aux attributs
    public String getNom() {
        return nom;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    // Méthode pour obtenir un terrain à une position donnée
    public Terrain getTerrain(int x, int y) throws TerrainInexistant {
        // Vérification si les coordonnées sont valides
        if(x < 0 || y < 0 || x >= largeur || y >= hauteur) {
            // Lancer une exception si les coordonnées sont invalides
            throw new TerrainInexistant(String.format("Terrain inexistant à la position (%d, %d)", x, y));
        }
        // Retourner le terrain aux coordonnées spécifiées
        return terrains[x][y];
    }

    // Constructeur prenant en compte un générateur de carte
    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) {
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        // Générer la carte en utilisant le générateur spécifié
        terrains = generateurCarte.genererCarte(largeur, hauteur);
    }

    // Constructeur prenant en compte une chaîne de caractères représentant les données de la carte
    public Carte(String donneesCarte) {
        // Initialisation d'un scanner pour lire les données de la carte
        Scanner scanner = new Scanner(donneesCarte);
        // Utilisation du format décimal américain pour les nombres à virgule
        scanner.useLocale(Locale.US);
        // Lecture du nom de la carte
        this.nom = scanner.nextLine();
        // Lecture de la largeur de la carte
        this.largeur = Integer.parseInt(scanner.nextLine());
        // Lecture de la hauteur de la carte
        this.hauteur = Integer.parseInt(scanner.nextLine());

        // Initialisation du tableau de terrains
        this.terrains = new Terrain[this.hauteur][this.largeur];
        // Parcourir chaque ligne de la carte pour lire les données des terrains
        for (int i = 0; i < this.hauteur; i++) {
            for (int j = 0; j < this.largeur; j++) {
                // Lecture de l'altitude, de l'hydrométrie et de la température du terrain
                double altitude = scanner.nextDouble();
                double hydrometrie = scanner.nextDouble();
                double temperature = scanner.nextDouble();
                // Création du terrain avec les données lues
                this.terrains[i][j] = new Terrain(altitude, hydrometrie, temperature);
            }
        }
        // Fermeture du scanner
        scanner.close();
    }
}
