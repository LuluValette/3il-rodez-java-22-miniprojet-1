package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum HydrometrieAffichee {
    // Définition des différentes hydrométries affichées avec leur valeur respective
    Sec(0.0),
    Moyen(0.33),
    Humide(0.66);

    // Attribut pour stocker la valeur d'hydrométrie
    private double valeurHydrometrie;

    // Constructeur prenant la valeur d'hydrométrie en paramètre
    HydrometrieAffichee(double hydrometrie){
        this.valeurHydrometrie=hydrometrie;
    }

    // Méthode pour obtenir la valeur d'hydrométrie
    public double getValeurHydrometrie() {
        return valeurHydrometrie;
    }
}
