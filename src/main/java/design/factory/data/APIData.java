package design.factory.data;

import java.util.logging.Logger;

public class APIData implements DataProvider{

	private static final Logger logger=Logger.getLogger(APIData.class.getName());
	public boolean getTestData() {
		logger.info("Get Data from Excel..");
		return true;	
	}
	

}
