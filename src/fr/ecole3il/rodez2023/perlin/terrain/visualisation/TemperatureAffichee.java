package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum TemperatureAffichee {
    // Définition des différentes températures affichées avec leur valeur respective
    Froid(0.0),
    Tempere(10.0),
    Chaud(20.0);

    // Attribut pour stocker la valeur de température
    private double valeurTemperature;

    // Constructeur prenant la valeur de température en paramètre
    TemperatureAffichee(double temperature) {
        this.valeurTemperature = temperature;
    }

    // Méthode pour obtenir la valeur de température
    public double getValeurLimite() {
        return valeurTemperature;
    }
}
