package factorypattern2;

public class App {

	public static void main(String[] args) {
		BatchProcessor batch= createBatchProcessor(args[1]);
		batch.processBatch(args[0]);
		System.out.println("done..");
	}

	private static BatchProcessor createBatchProcessor(String string) {
		if(string.equalsIgnoreCase("text")){
			return new TextBatchProcessor();
		}
		else if(string.equalsIgnoreCase("xml")){
		return new XMLBatchProcessor();
		}
		else if(string.equalsIgnoreCase("csv")){
			return new CSVBatchProcessor();
			}
		else
			return null;
	}

}
