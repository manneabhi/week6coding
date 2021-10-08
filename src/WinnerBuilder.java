import java.util.ArrayList;
import java.util.List;

public abstract class WinnerBuilder {


	String name;
	List<String> item = new ArrayList<String>();
	
	public abstract WinnerBuilder addChicken();
	public abstract WinnerBuilder addVegetables();
	public abstract WinnerBuilder addEggs();
	public abstract WinnerBuilder addSauces();
	public abstract WinnerBuilder addCorn();
	
	public Soup build() {
		Soup soup = new Soup();
		soup.setName(this.name);
		soup.addItems(item);
		return soup;
	}
	public String toString() {
		return "YOU'RE A WINNER!";
	}
}
