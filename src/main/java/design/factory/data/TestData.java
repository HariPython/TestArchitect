package design.factory.data;

public class TestData {

	public static void main(String[] args) {
		DataProviderFactory.getDataSource(DataSource.Faker).getTestData();
	}
}
