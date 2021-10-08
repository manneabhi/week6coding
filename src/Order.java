
public class Order implements State
{

	Soup soup;
	
	public Order(Soup soup) {
		this.soup = soup;
	}

	@Override
	public void start() {
		System.out.println("Your order is start now");	

	}

	@Override
	public void stop() {
		System.out.println("Your order is ended!!!");	

	}

	
}
