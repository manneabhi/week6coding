
public class VegSoupClass extends WinnerBuilder{

	public VegSoupClass() {
		this.name = "Vegeterian Soup";
	}
	@Override
	public WinnerBuilder addChicken() {
		return this;
	}

	@Override
	public WinnerBuilder addVegetables() {
		this.item.add("vegetables");
		return this;	
		}

	@Override
	public WinnerBuilder addEggs() {
		return this;
	}

	@Override
	public WinnerBuilder addSauces() {
		this.item.add("sauces");
		return this;
		}

	@Override
	public WinnerBuilder addCorn() {
		this.item.add("corn");
		return this;	
		}

}
