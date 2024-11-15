package design.factory.dosa;

import java.util.logging.Logger;

public class DosaHelper {
	
	private static final Logger logger = Logger.getLogger(DosaHelper.class.getName());

	public static void createBatter() {
		logger.info("Making batter for dosa..");
	}

	public static void fermentBatter() {
		logger.info("Ferment batter for dosa..");
	}

	public static void heatApliance() {
		logger.info("Heat appliance for dosa..");
	}

}
