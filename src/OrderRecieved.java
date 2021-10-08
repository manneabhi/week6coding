public class OrderRecieved implements State
{

	Soup soup;
	
	public OrderRecieved(Soup soup) {
		this.soup = soup;
	}

	@Override
	public void start() {
		System.out.println("Your order will recieve soon");	

	}

	@Override
	public void stop() {
		System.out.println("Your recieved an order!!!");	

	}

	
}
