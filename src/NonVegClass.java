
public class NonVegClass  extends WinnerBuilder{

	public NonVegClass() {
		this.name = "Non Vegeterian Soup";
	}
	@Override
	public WinnerBuilder addChicken() {
		this.item.add("chicken");
		return this;
	}

	@Override
	public WinnerBuilder addVegetables() {
		return this;	
		}

	@Override
	public WinnerBuilder addEggs() {
		this.item.add("eggs");
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
