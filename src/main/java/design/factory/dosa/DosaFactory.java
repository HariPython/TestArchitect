package design.factory.dosa;

public class DosaFactory {
	
	public static Dosa createDosa (DosaTypes dosaType) {
		prepareDosa();
		
		switch(dosaType) {
		case Podi:
			return new Podi();
			
		case Masala:
			return new Masala();
			
		case Onion:
			return new Onion();
			
		default:
			throw new IllegalArgumentException("Unknown Dosa type");	
		}
	}

	private static void prepareDosa() {
		// Common Steps here such as: Prepare Batter, Ferment, and Heat the appliance.
		DosaHelper.createBatter();
		DosaHelper.fermentBatter();
		DosaHelper.heatApliance();
		}
	}
