public class SoupMainClass {

	public static void main(String[] args) {

		WinnerBuilder veggieBuilder = new VegSoupClass();
		Soup veggie = veggieBuilder.addChicken().addVegetables().addEggs().addSauces().addCorn().build();
		
		veggie.setS(new Order(veggie));
		veggie.start();
		veggie.prepare();

		veggie.setS(new Packed(veggie));	
		veggie.start();
		veggie.stop();
		
		veggie.setS(new Delivered(veggie));	
		veggie.start();
		veggie.stop();
		
		veggie.setS(new OrderRecieved(veggie));	
		veggie.start();
		veggie.stop();
		
		veggie.setS(new Order(veggie));
		veggie.stop();
		
		System.out.println("Starting new order :");

		WinnerBuilder nonveggieBuilder = new NonVegClass();
		Soup nonveg = nonveggieBuilder.addChicken().addVegetables().addEggs().addSauces().addCorn().build();
		
		nonveg.setS(new Order(nonveg));
		nonveg.start();
		nonveg.prepare();

		nonveg.setS(new Packed(nonveg));	
		nonveg.start();
		nonveg.stop();
		
		nonveg.setS(new Delivered(nonveg));	
		nonveg.start();
		nonveg.stop();
		
		nonveg.setS(new OrderRecieved(nonveg));	
		nonveg.start();
		nonveg.stop();
		
		nonveg.setS(new Order(nonveg));
		nonveg.stop();
	}
}
