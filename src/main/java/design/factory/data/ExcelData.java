package design.factory.data;

import java.util.logging.Logger;

public class ExcelData implements DataProvider{

	private static final Logger logger=Logger.getLogger(ExcelData.class.getName());
	
	public boolean getTestData() {
		logger.info("Get Data from Excel..");
		return true;	
	}
	

}
