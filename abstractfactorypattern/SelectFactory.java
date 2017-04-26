package abstractfactorypattern;

public class SelectFactory{
	public static AbstractFactory getFactory(String factory){
		if(factory.equalsIgnoreCase("Color")){
			return new Colorfactory();
		}
			else if(factory.equalsIgnoreCase("Shape"))
				return new ShapeFactory();
		return null;
	}

}
