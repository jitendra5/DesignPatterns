package factorypattern2;

import java.util.List;

public class CSVParser implements Parser {

	@Override
	public List<Record> parse() {
		System.out.println("Parsing CSV file..");
		return null;
	}

}
