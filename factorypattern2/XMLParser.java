package factorypattern2;

import java.util.List;

public class XMLParser implements Parser {

	@Override
	public List<Record> parse() {
		System.out.println("Parsing xml file");
		return null;
	}

}
