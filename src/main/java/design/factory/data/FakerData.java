package design.factory.data;

import java.util.logging.Logger;

public class FakerData implements DataProvider{

	private static final Logger logger=Logger.getLogger(FakerData.class.getName());
	public boolean getTestData() {
		logger.info("Get Data from Faker..");
		return true;	
	}
	

}
