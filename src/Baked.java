public class Baked implements State
{

	Soup soup;
	
	public Baked(Soup soup) {
		this.soup = soup;
	}

	@Override
	public void start() {
		System.out.println("Your order will bake soon");	

	}

	@Override
	public void stop() {
		System.out.println("Your order has baked!!!");	

	}

	
}
