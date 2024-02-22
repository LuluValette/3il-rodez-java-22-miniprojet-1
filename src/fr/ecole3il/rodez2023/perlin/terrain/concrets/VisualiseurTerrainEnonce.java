package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.exception.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.AltitudeAffichee;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.HydrometrieAffichee;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.TemperatureAffichee;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.VisualiseurTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

public class VisualiseurTerrainEnonce extends VisualiseurTerrain {

	// Constructeur prenant une carte en paramètre et utilisant le détermineur de terrain enoncé
	public VisualiseurTerrainEnonce(Carte c) {
		// Appel du constructeur de la classe parent avec la carte et le détermineur de terrain enoncé
		super(c, new DetermineurTerrainEnonce());
	}

	@Override
	public AltitudeAffichee getAltitudeAffichee(int x, int y) throws TerrainInexistant {
		return null;
	}

	@Override
	public HydrometrieAffichee getHydrometrieAffichee(int x, int y) throws TerrainInexistant {
		return null;
	}

	@Override
	public TemperatureAffichee getTemperatureAffichee(int x, int y) throws TerrainInexistant {
		return null;
	}

	@Override
	public TypeTerrain getTypeTerrain(int x, int y) throws TerrainInexistant {
		return null;
	}
}
