package BuilderPattern;

public abstract class Burger implements Item {

	@Override
	public abstract String name() ;

	@Override
	public abstract int cost();

	@Override
	public Packaging packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}



}
