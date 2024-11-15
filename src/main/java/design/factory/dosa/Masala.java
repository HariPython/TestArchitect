package design.factory.dosa;

import java.util.logging.Logger;

public class Masala implements Dosa {
	
	private static final Logger logger=Logger.getLogger(Masala.class.getName());
	
	public boolean spreadFlavour() {
		logger.info("Apply Masala to Dosa");
		return true;
	}

}
