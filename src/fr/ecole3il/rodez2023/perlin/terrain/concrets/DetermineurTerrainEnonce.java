package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class DetermineurTerrainEnonce implements DetermineurTerrain {

	@Override
	public TypeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature) {
		// Détermination du type de terrain en fonction des paramètres d'entrée
		if (altitude < 0) {
			// Si l'altitude est inférieure à 0, le terrain est considéré comme un océan
			return TypeTerrain.OCEAN;
		} else if (hydrometrie <= 0.25) {
			// Si l'hydrométrie est inférieure ou égale à 0.25
			if (altitude <= 0.7) {
				// Si l'altitude est inférieure ou égale à 0.7
				if (temperature <= 0.25) {
					// Si la température est inférieure ou égale à 0.25
					return TypeTerrain.PLAINE;
				} else if (temperature <= 0.7) {
					// Si la température est inférieure ou égale à 0.7
					return TypeTerrain.FORET_DE_FEUILLUS;
				} else {
					// Sinon, la température est supérieure à 0.7
					return TypeTerrain.TOUNDRA;
				}
			} else {
				// Sinon, l'altitude est supérieure à 0.7
				if (temperature <= 0.25) {
					// Si la température est inférieure ou égale à 0.25
					return TypeTerrain.PLAINE;
				} else if (temperature <= 0.7) {
					// Si la température est inférieure ou égale à 0.7
					return TypeTerrain.FORET_DE_CONIFERES;
				} else {
					// Sinon, la température est supérieure à 0.7
					return TypeTerrain.MONTAGNE;
				}
			}
		} else {
			// Sinon, l'hydrométrie est supérieure à 0.25
			if (altitude <= 0.7) {
				// Si l'altitude est inférieure ou égale à 0.7
				if (temperature <= 0.25) {
					// Si la température est inférieure ou égale à 0.25
					return TypeTerrain.DESERT;
				} else if (temperature <= 0.7) {
					// Si la température est inférieure ou égale à 0.7
					return TypeTerrain.COLLINES;
				} else {
					// Sinon, la température est supérieure à 0.7
					return TypeTerrain.MONTAGNE;
				}
			} else {
				// Sinon, l'altitude est supérieure à 0.7
				if (temperature <= 0.25) {
					// Si la température est inférieure ou égale à 0.25
					return TypeTerrain.MARAIS;
				} else if (temperature <= 0.7) {
					// Si la température est inférieure ou égale à 0.7
					return TypeTerrain.FORET_DE_CONIFERES;
				} else {
					// Sinon, la température est supérieure à 0.7
					return TypeTerrain.MONTAGNE;
				}
			}
		}
	}

}
