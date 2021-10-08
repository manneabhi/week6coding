
public class Packed implements State
{

	Soup soup;
	
	public Packed(Soup soup) {
		this.soup = soup;
	}

	@Override
	public void start() {
		System.out.println("The packing of your order is starting");	

	}

	@Override
	public void stop() {
		System.out.println("The packing of your order has finished!!!");	

	}

	
}
