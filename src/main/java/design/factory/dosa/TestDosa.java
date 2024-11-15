package design.factory.dosa;

public class TestDosa {

	public static void main(String[] args) {
		Dosa dosa=DosaFactory.createDosa(DosaTypes.Masala);
		dosa.spreadFlavour();
		
		// Dosa dosa=DosaFactory.createDosa(DosaTypes.Masala).spreadFlavour();
		
		// Dosa dosa=DosaFactory.createDosa(DosaTypes.Ghee);
		// dosa.spreadFlavour();
	}

}
