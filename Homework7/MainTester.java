import java.util.StringTokenizer; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MainTester {
	public static void main(String[] args) {
		
		TestData data;
		
		if(args[0].equals("h"))
			display a box with the help message
		else if(args[0].equals("n"))
			//If an object is entered by the user, this code will run:
			data = testObject;
		else if(args[0].equals("f"))
			//If a data file is entered by the user, this code will run:
			data = parseFile(testData.txt)
		else
			//If nothing is entered by the user, this code will run:
			data = new TestData();
		
	        runTest(TestData data);
	}
	
	private static void runTest();
		System.out.println("*** MAIN TESTER ***");
	        System.out.println("    IF failure -> Asserts error,");
	        System.out.println("    OTHERWISE -> nothing thrown or returned (should see no output.)");
	
	        System.out.println("\n--- BEGIN TESTING ---\n");
	
		System.out.println("    Running Edge Field Tester...");
		EdgeConvertTest ect = new EdgeConvertTest(data);
	        System.out.println("    ...SUCCESSFUL EXECUTION. Passed all tests.\n");
	
		System.out.println("    Running Edge Table Tester...");
	        CreateDDLTest cdt = new CreateDDLTest(data);
	        System.out.println("    ...SUCCESSFUL EXECUTION. Passed all tests.\n");
	
	        System.out.println("\n--- FINISH TESTING ---\n");
	
	        System.out.println("*** END OF MAIN TESTER ***");
	}
	
	private static TestData getDefaultData(){
		TestData data = new TestData();
		return data;
		
	}
	
	private static TestData parseFile(String fileName){
      		TestData data = new TestData();
      		StringTokenizer tokenizer;
      
	        try{
	         
		        BufferedReader in = new BufferedReader (new FileReader(fileName));
		         
		        String line = in.readLine();
		        tokenizer = new StringTokenizer(line, "|");
		            
		        while(tokenizer.hasMoreTokens()) {
				data.intA = Integer.parseInt(tokenizer.nextToken());
				data.stringA = tokenizer.nextToken();;
				data.stringB = tokenizer.nextToken();;
				data.intB = Integer.parseInt(tokenizer.nextToken());
				data.intC = Integer.parseInt(tokenizer.nextToken());
				data.intD = Integer.parseInt(tokenizer.nextToken());
				data.intE = Integer.parseInt(tokenizer.nextToken());
				data.stringC = tokenizer.nextToken();;
				data.stringD = tokenizer.nextToken();;
				data.stringE = tokenizer.nextToken();;
				data.stringF = tokenizer.nextToken();;
				data.file = tokenizer.nextToken();;
		        }              
	      	}
	        catch(IOException e){
		        System.out.println(e);
		        System.err.println("File name is invalid.");
	        }
	        return data;
	}
}

public class TestData{
	//CreateDDLTest data
	public static int intA = 7;
	public static String stringA = "TESTTABLE";
	public static String stringB = "testName";
	public static int intB = 8;
	public static int intC = 9;
	public static int intD = 10;
	public static int intE = 11;
	public static String stringC = "testDefaultValue";
	public static String stringD = "MySQLDB";
	public static String stringE = "MySQL";
	public static String stringF = "";
	//EdgeConvertTest data
	public static String file = "Courses.edg";
}
