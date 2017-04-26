package factorypattern2;

import java.io.File;

public class XMLBatchProcessor extends BatchProcessor{

	@Override
	public Parser createParser(File file2) {
		return new XMLParser();
	}

}
