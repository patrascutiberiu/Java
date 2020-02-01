package fr.tib.voiture;

public class Moteur {

	private float volume_reservoir;
	private float volume_total = 60;
	private boolean demarre;

	public float getVolume_reservoir() {
		return volume_reservoir;
	}

	public void setVolume_reservoir(float volume_reservoir) {
		this.volume_reservoir = volume_reservoir;
	}

	public float getVolume_total() {
		return volume_total;
	}

	public void setVolume_total(float volume_total) {
		this.volume_total = volume_total;
	}

	public boolean isDemarre() {
		return demarre;
	}

	public void setDemarre(boolean demarre) {
		this.demarre = demarre;
	}

	public boolean demarrer() {
		volume_reservoir = volume_reservoir - (float) 1 / 10;
		System.out.printf("\nJ'ai demarré avec %.1f dans le reservoir.",volume_reservoir );
		return true;
	}

	public float utiliser(float carbNecessaire) {
		if (carbNecessaire > volume_reservoir) {
			volume_reservoir = 0;
			System.out.println("Je suis en panne !\nJ'ai besoin d'essence ! ");
			return volume_reservoir;
		} else {
			volume_reservoir= volume_reservoir - carbNecessaire;
			System.out.printf("Le moteur utilise : %.1f litres et il reste : %.1f litres ", carbNecessaire, volume_reservoir);
			return volume_reservoir;
		}
	}

	public void faireLePlain(float litreCarb) {
		// volume_reservoir = volume_reservoir + litreCarb;
		System.out.println("Volume reservoir en ce moment " + volume_reservoir + " litres");

//		if (volume_reservoir> volume_total)
//		{
//			System.out.println("Beaucoup de l'essance ! ");
//		}
	}

	public void arreter() {
		System.out.println("Je me suis arreté !");
	}
}
