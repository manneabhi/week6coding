import java.util.List;

public class Soup {
	State order;
	State baked;
	State pack;
	State deliver;
	State receive;
	
	State s;
	String name;
	List<String> toppings;
	public Soup()
	    {
	    	order = new Order(this);
	    	baked = new Baked(this);
	    	pack = new Packed(this);
	    	deliver = new Delivered(this);    
	    	receive = new OrderRecieved(this);
	    }
	void addItems(List<String> toppings) {
		this.toppings = toppings;
	}
 
	void prepare() {
		System.out.println("Prepare " + name + " with :");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
	public void start() {

		s.start();
	}

	public void stop() {

		s.stop();
	}
 
	public void setName(String name) {
		this.name = name;
	}

	
	public State getS() {
		return s;
	}
	public void setS(State s) {
		this.s = s;
	}
	public State getOrder() {
		return order;
	}
	public State getBaked() {
		return baked;
	}
	public State getPack() {
		return pack;
	}
	public State getDeliver() {
		return deliver;
	}
	public State getReceive() {
		return receive;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}


