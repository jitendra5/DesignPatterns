package abstractfactorypattern;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory shape= SelectFactory.getFactory("color");
		shape.getColor("red").fill();
		AbstractFactory shape1= SelectFactory.getFactory("shape");
		shape1.getShape("circle").draw();
		
	}

}
