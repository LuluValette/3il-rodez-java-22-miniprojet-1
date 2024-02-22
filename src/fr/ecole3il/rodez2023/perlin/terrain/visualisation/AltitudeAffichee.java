package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum AltitudeAffichee {
    // Définition des différentes altitudes affichées avec leur valeur respective
    FondMarin(-1.0),
    Basse(0.0),
    Moyenne(0.33),
    Elevee(0.66);

    // Attribut pour stocker la valeur d'altitude
    private double valeurAltitude;

    // Constructeur prenant la valeur d'altitude en paramètre
    AltitudeAffichee(double altitude) {
        this.valeurAltitude = altitude;
    }

    // Méthode pour obtenir la valeur d'altitude
    public double getValeurAltitude() {
        return valeurAltitude;
    }
}
