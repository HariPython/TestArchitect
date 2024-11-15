package design.factory.data;

import java.util.logging.Logger;

public class HardcodedData implements DataProvider{

	private static final Logger logger=Logger.getLogger(HardcodedData.class.getName());
	public boolean getTestData() {
		logger.info("Get Data from Excel..");
		return true;	
	}
	

}
