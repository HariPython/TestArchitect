package design.factory.data;

import java.util.logging.Logger;

public class DataProviderFactory {
		
	private static final Logger logger=Logger.getLogger(DataProviderFactory.class.getName());
	
	public static DataProvider getDataSource(DataSource dataSource) {
		
		switch(dataSource) {
		
		case Excel:
			logger.info("Creating handle for Excel");
			return new ExcelData();
			
		case Faker:
			logger.info("Creating handle for Faker");
			return new FakerData();
			
		case Database:
			logger.info("Creating handle for Database");
			return new DatabaseData();
			
		case API:
			logger.info("Creating handle for API");
			return new APIData();	
			
		case Hardcoded:
			logger.info("Creating handle for Hardcoded Value");
			return new HardcodedData();
			
		default:		
			throw new IllegalArgumentException("Argument not supported");
		}
	}

}
