package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.VisualiseurTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

public class VisualiseurTerrainEnonce extends VisualiseurTerrain {

	// Constructeur prenant une carte en paramètre et utilisant le détermineur de terrain enoncé
	public VisualiseurTerrainEnonce(Carte c) {
		// Appel du constructeur de la classe parent avec la carte et le détermineur de terrain enoncé
		super(c, new DetermineurTerrainEnonce());
	}

}
