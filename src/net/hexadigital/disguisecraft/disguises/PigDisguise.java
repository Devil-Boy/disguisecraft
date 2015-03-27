package net.hexadigital.disguisecraft.disguises;

public interface PigDisguise extends AnimalDisguise, VehicleDisguise {

	/**
	 * Gets whether this pig disguise is wearing a saddle
	 * @return True if saddled
	 */
	boolean hasSaddle();
	
	/**
	 * Sets the saddle state of this pig disguise
	 * @param saddled True saddles the pig, false removes the saddle
	 */
	void setSaddle(boolean saddled);
}
