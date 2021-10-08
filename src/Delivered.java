
public class Delivered implements State
{

	Soup soup;
	
	public Delivered(Soup soup) {
		this.soup = soup;
	}

	@Override
	public void start() {
		System.out.println("Your order will deliver soon");	

	}

	@Override
	public void stop() {
		System.out.println("Your order has deliverd!!!");	

	}

	
}