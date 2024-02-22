package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

/**
 * L'interface DetermineurTerrain définit une méthode pour déterminer le type de terrain en fonction des composantes.
 */
public interface DetermineurTerrain {

	/**
	 * Méthode pour déterminer le type de terrain en fonction des composantes données.
	 *
	 * @param altitude     L'altitude du terrain.
	 * @param hydrometrie  L'hydrométrie du terrain.
	 * @param temperature  La température du terrain.
	 * @return Le type de terrain déterminé.
	 */
	TypeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature);

}
