package design.factory.data;

import java.util.logging.Logger;

public class DatabaseData implements DataProvider{

	private static final Logger logger=Logger.getLogger(DatabaseData.class.getName());
	public boolean getTestData() {
		logger.info("Get Data from Hard coded value..");
		return true;	
	}

}
