package factorypattern2;

import java.util.List;

public class TextParser implements Parser {

	@Override
	public List<Record> parse() {
		System.out.println("Parsing the textfile");
		return null;
	}

}
