package factorypattern;

public class ShapeFactory {
	public Shape getFigure(String shape){
		if(shape.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("Square")){
			return new Square();
		}
		else 
			return null;
		
	}

}
