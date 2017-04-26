package factorypattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory= new ShapeFactory();
		factory.getFigure("circle").draw();
		factory.getFigure("square").draw();
		factory.getFigure("rectangle").draw(); }

}
