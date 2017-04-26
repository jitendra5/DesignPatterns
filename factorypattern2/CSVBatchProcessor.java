package factorypattern2;

import java.io.File;

public class CSVBatchProcessor extends BatchProcessor{
	@Override
	public Parser createParser(File file2){
		return new CSVParser();
	}

}
