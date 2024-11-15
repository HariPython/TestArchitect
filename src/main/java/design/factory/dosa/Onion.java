package design.factory.dosa;

import java.util.logging.Logger;

public class Onion implements Dosa {
	
	private static final Logger logger=Logger.getLogger(Onion.class.getName());
	
	public boolean spreadFlavour() {
		logger.info("Apply Onion to Dosa");
		return true;
	}

}
