package design.factory.dosa;

import java.util.logging.Logger;

public class Podi implements Dosa {
	
	private static final Logger logger=Logger.getLogger(Podi.class.getName());
	
	public boolean spreadFlavour() {
		logger.info("Apply Podi to Dosa");
		return true;
	}

}
