package factorypattern2;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
	public void processBatch(String fileName){
 File file= openFile(fileName);
 Parser parser= createParser(file);// Factory method
 List<Record> records=parser.parse();
 processRecords(records);
 writeSummery();
 closeFile(file);
	}
	//factory method.
public abstract Parser createParser(File file2);
 private File openFile(String filaName) {
	 // TODO Auto-generated method stub
	 System.out.println("Opening the file..");
	 return null;
 }
 private void processRecords(List<Record> records) {
	 System.out.println("Processing the record..");
	 
 }
 public void writeSummery(){
	 System.out.println("The parsing is done.");
 }
 public void closeFile(File file){
	 System.out.println("The file is closed.");
 }

}
